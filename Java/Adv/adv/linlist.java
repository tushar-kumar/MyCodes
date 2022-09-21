import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class linlist {
    public static void main(String[] args) {

        // creating linked list to store variables
        LinkedList<Integer> list = new LinkedList<Integer>();

        // storing 10 random values into list initially
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 10 + 1);
            list.add(num);
        }

        // creating JFrame object
        JFrame frame = new JFrame();
        frame.setTitle("Mini Project");
        frame.setSize(600, 600);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 10));

        // creating JTextField object
        JTextField field = new JTextField();
        // setting dimension and font
        field.setPreferredSize(new Dimension(550, 100));
        field.setFont(new Font("Times_New_Roman", Font.BOLD, 20));
        // setting field as non editable
        field.setEditable(false);
        // setting color and text alignment
        field.setHorizontalAlignment(JTextField.CENTER);

        // creating string buffer to convert
        // list elements to string
        StringBuffer str = new StringBuffer();

        // converting list elements to string
        // and adding them to the end of StringBuffer
        str.append("{ ");
        for (int i = 0; i < list.size(); i++) {
            str.append(list.get(i) + ", ");
        }
        str.append("}");

        // setting text of field
        field.setText("List-->" + str.toString());

        // creating Radio Buttons
        JRadioButton stack = new JRadioButton("Stack");
        stack.setPreferredSize(new Dimension(100, 100));
        stack.setFont(new Font("Times_New_Roman", Font.BOLD, 20));
        stack.setBorderPainted(true);

        JRadioButton queue = new JRadioButton("Queue");
        queue.setPreferredSize(new Dimension(100, 100));
        queue.setFont(new Font("Times_New_Roman", Font.BOLD, 20));
        queue.setBorderPainted(true);

        // creating button group for working of radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(stack);
        group.add(queue);

        // creating JButtons for operations
        JButton push = new JButton("Push");
        JButton pop = new JButton("Pop");
        JButton add = new JButton("Add");
        JButton delete = new JButton("Delete");

        push.setPreferredSize(new Dimension(100, 50));
        pop.setPreferredSize(new Dimension(100, 50));
        add.setPreferredSize(new Dimension(100, 50));
        delete.setPreferredSize(new Dimension(100, 50));

        push.setFont(new Font("Times_New_Roman", Font.BOLD, 20));
        pop.setFont(new Font("Times_New_Roman", Font.BOLD, 20));
        add.setFont(new Font("Times_New_Roman", Font.BOLD, 20));
        delete.setFont(new Font("Times_New_Roman", Font.BOLD, 20));

        // creating a JText field to show status
        JTextField stat = new JTextField();
        stat.setPreferredSize(new Dimension(400, 50));
        stat.setFont(new Font("Times_New_Roman", Font.BOLD, 20));
        stat.setHorizontalAlignment(JTextField.CENTER);

        // adding logic to push button
        push.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stack.isSelected()) {
                    try {
                        int value = Integer.parseInt(JOptionPane.showInputDialog("Enter number push------"));
                        list.add(value);

                        // updating text field
                        StringBuffer str1 = new StringBuffer();
                        str1.append("{ ");
                        for (int i = 0; i < list.size(); i++) {
                            str1.append(list.get(i) + ", ");
                        }
                        str1.append("}");
                        field.setText("List-->" + str1.toString());
                        stat.setText("Successfully Pushed " + value + " to List");

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Enter Only Integer to Push", "Error",
                                JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    // showing error option in case of invalid choice
                    JOptionPane.showMessageDialog(null, "Invalid Operation--\nSelect Stack For Push Operation",
                            "Error Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // adding logic to pop button
        pop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stack.isSelected()) {
                    int value = list.removeLast();
                    // updating text field
                    StringBuffer str1 = new StringBuffer();
                    str1.append("{ ");
                    for (int i = 0; i < list.size(); i++) {
                        str1.append(list.get(i) + ", ");
                    }
                    str1.append("}");
                    field.setText("List-->" + str1.toString());
                    stat.setText("Successfully Popped " + value + " from List");
                } else {
                    // showing error option in case of invalid choice
                    JOptionPane.showMessageDialog(null, "Invalid Operation--\nSelect Stack for Pop Operation",
                            "Error Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // adding logic to add button
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (queue.isSelected()) {
                    try {
                        int value = Integer.parseInt(JOptionPane.showInputDialog("Enter number add------"));
                        list.add(value);
                        // updating text field
                        StringBuffer str1 = new StringBuffer();
                        str1.append("{ ");
                        for (int i = 0; i < list.size(); i++) {
                            str1.append(list.get(i) + ", ");
                        }
                        str1.append("}");
                        field.setText("List-->" + str1.toString());
                        stat.setText("Successfully Added " + value + " to List");

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Enter Only Integer to Add", "Error",
                                JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    // showing error option in case of invalid choice
                    JOptionPane.showMessageDialog(null, "Invalid Operation--\nSelect Queue for Add Operation",
                            "Error Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // adding logic to delete button
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (queue.isSelected()) {
                    int value = list.removeFirst();
                    // updating text field
                    StringBuffer str1 = new StringBuffer();
                    str1.append("{ ");
                    for (int i = 0; i < list.size(); i++) {
                        str1.append(list.get(i) + ", ");
                    }
                    str1.append("}");
                    field.setText("List-->" + str1.toString());

                    stat.setText("Successfully Deleted " + value + " from List");
                } else {
                    // showing error option in case of invalid choice
                    JOptionPane.showMessageDialog(null, "Invalid Operation--\nSelect Queue for Delete Operation",
                            "Error Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // adding components to frame
        frame.add(field);
        frame.add(stack);
        frame.add(queue);
        frame.add(push);
        frame.add(add);
        frame.add(pop);
        frame.add(delete);
        frame.add(stat);

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}