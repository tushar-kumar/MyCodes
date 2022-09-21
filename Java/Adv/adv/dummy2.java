import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class dummy2 {

    public static void main(String[] args) {
        new GUI();
    }
}

class GUI extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    Panel panel = new Panel();

    LinkedList<Integer> list = new LinkedList<Integer>();
    LinkedList<Integer> list1 = new LinkedList<Integer>();

    JRadioButton r1 = new JRadioButton("STACK");
    JRadioButton r2 = new JRadioButton("QUEUE");

    Button b1 = new Button("Push");
    Button b2 = new Button("Pop");
    Button b3 = new Button("Add");
    Button b4 = new Button("Delete");

    GUI() {

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        JLabel label = new JLabel("Linked List elements are: ");

        String str = new String();
        for (int i = 0; i < list.size(); i++) {
            str = str + list.get(i).toString() + "\t";
        }

        JTextArea text = new JTextArea(str);

        frame.add(panel);

        panel.add(label);
        panel.add(text);

        // adding radio button r1
        panel.add(r1);

        // adding radio button r2
        panel.add(r2);

        ButtonGroup G = new ButtonGroup();
        G.add(r1);
        G.add(r2);

        // adding button b1
        b1.addActionListener(this);
        panel.add(b1);
        b1.setBounds(30, 50, 60, 60);
        frame.setSize(400, 450);
        b1.setForeground(Color.BLACK);

        // adding button b2
        b2.addActionListener(this);
        panel.add(b2);
        b2.setBounds(30, 50, 60, 60);
        frame.setSize(400, 450);
        b2.setForeground(Color.BLACK);

        // adding button b3
        b3.addActionListener(this);
        panel.add(b3);
        b3.setBounds(30, 50, 60, 60);
        frame.setSize(400, 450);
        b3.setForeground(Color.BLACK);

        // adding button b4
        b4.addActionListener(this);
        panel.add(b4);
        b4.setBounds(30, 50, 60, 60);
        frame.setSize(400, 450);
        b4.setForeground(Color.BLACK);

        panel.setBounds(100, 100, 300, 200);
        panel.setSize(300, 200);
        panel.setLayout(new FlowLayout());

        frame.setTitle("Stack");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if ((r1.isSelected()) && (e.getSource() == b1)) {
                JFrame frame2 = new JFrame("Stack - performing push operation!");
                Panel panel2 = new Panel();

                String num = JOptionPane.showInputDialog(frame2, "Enter Value: ");

                list.addLast(Integer.parseInt(num));

                JLabel label = new JLabel("Updated Linked List elements are: ");

                String str = new String();
                for (int i = 0; i < list.size(); i++) {
                    str = str + list.get(i).toString() + "\t";
                }

                JTextArea text = new JTextArea(str);

                frame2.add(panel2);

                panel2.add(label);
                panel2.add(text);
                panel2.setBounds(100, 100, 300, 200);
                panel2.setSize(300, 200);
                panel2.setLayout(new FlowLayout());

                frame2.setTitle("Stack");
                frame2.setSize(300, 300);
                frame2.setVisible(true);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            } else if ((r1.isSelected()) && (e.getSource() == b2)) {
                JFrame frame3 = new JFrame("Stack - performing pop operation!");
                Panel panel3 = new Panel();

                list.removeLast();

                JLabel label = new JLabel("Updated Linked List elements are: ");

                String str = new String();
                for (int i = 0; i < list.size(); i++) {
                    str = str + list.get(i).toString() + "\t";
                }

                JTextArea text = new JTextArea(str);

                frame3.add(panel3);

                panel3.add(label);
                panel3.add(text);
                panel3.setBounds(100, 100, 300, 200);
                panel3.setSize(300, 200);
                panel3.setLayout(new FlowLayout());

                frame3.setTitle("Stack");
                frame3.setSize(300, 300);
                frame3.setVisible(true);
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }

            else if ((r2.isSelected()) && (e.getSource() == b3)) {

            }

            else if ((r2.isSelected()) && (e.getSource() == b4)) {

            }

            else if ((r1.isSelected()) && (e.getSource() == b3)) {
                throw new Exception();
            } else if ((r1.isSelected()) && (e.getSource() == b4)) {
                throw new Exception();
            } else if ((r2.isSelected()) && (e.getSource() == b1)) {
                throw new Exception();
            } else if ((r2.isSelected()) && (e.getSource() == b2)) {
                throw new Exception();
            }

        } catch (Exception Ex) {

            if ((r1.isSelected()) && (e.getSource() == b3)) {
                JOptionPane.showMessageDialog(frame, "Invalid Operation!", "Alert", JOptionPane.WARNING_MESSAGE);
                frame.setDefaultCloseOperation(3);
            } else if ((r1.isSelected()) && (e.getSource() == b4)) {
                JOptionPane.showMessageDialog(frame, "Invalid Operation!", "Alert", JOptionPane.WARNING_MESSAGE);
                frame.setDefaultCloseOperation(3);
            } else if ((r2.isSelected()) && (e.getSource() == b1)) {
                JOptionPane.showMessageDialog(frame, "Invalid Operation!", "Alert", JOptionPane.WARNING_MESSAGE);
                frame.setDefaultCloseOperation(3);
            } else if ((r2.isSelected()) && (e.getSource() == b2)) {
                JOptionPane.showMessageDialog(frame, "Invalid Operation!", "Alert", JOptionPane.WARNING_MESSAGE);
                frame.setDefaultCloseOperation(3);
            }
        }
    }

}