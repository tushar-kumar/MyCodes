import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class proch{
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        for(int i=0;i<10;i++){
            int num=(int)(Math.random()*10+1);
            list.add(num);
        }
        JFrame frame=new JFrame();
        frame.setTitle("Java GUI Project");
        frame.setSize(600,600);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,150,10));
        JTextField field=new JTextField();
        field.setPreferredSize(new Dimension(550,100));
        field.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        field.setEditable(false);
        field.setBackground(Color.green);
        field.setHorizontalAlignment(JTextField.CENTER);
       StringBuffer str=new StringBuffer();
       str.append("{ ");
       for(int i=0;i< list.size();i++){
           str.append(list.get(i)+", ");
       }
        str.append("}");
        field.setText("List: "+str.toString());
        JRadioButton stack=new JRadioButton("Stack");
        stack.setPreferredSize(new Dimension(100,100));
        stack.setBackground(Color.CYAN);
        stack.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        stack.setBorderPainted(true);
        JRadioButton queue=new JRadioButton("Queue");
        queue.setPreferredSize(new Dimension(100,100));
        queue.setBackground(Color.yellow);
        queue.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        queue.setBorderPainted(true);
        ButtonGroup group=new ButtonGroup();
        group.add(stack);
        group.add(queue);
        JButton push=new JButton("Push");
        JButton pop=new JButton("Pop");
        JButton add=new JButton("Add");
        JButton delete=new JButton("Delete");
        push.setPreferredSize(new Dimension(100,50));
        pop.setPreferredSize(new Dimension(100,50));
        add.setPreferredSize(new Dimension(100,50));
        delete.setPreferredSize(new Dimension(100,50));
        push.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        pop.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        add.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        delete.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        push.setBackground(Color.cyan);
        pop.setBackground(Color.cyan);
        add.setBackground(Color.yellow);
        delete.setBackground(Color.yellow);
        JTextField stat=new JTextField();
        stat.setPreferredSize(new Dimension(400,50));
        stat.setBackground(Color.green);
        stat.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        stat.setHorizontalAlignment(JTextField.CENTER);
        push.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(stack.isSelected()){
                    try {
int value = Integer.parseInt(JOptionPane.showInputDialog("Enter number push------"));
                        list.add(value);
                        StringBuffer str1=new StringBuffer();
                        str1.append("{ ");
                        for(int i=0;i< list.size();i++){
                            str1.append(list.get(i)+", ");
                        }
                        str1.append("}");
                        field.setText("List-->"+str1.toString());
                        stat.setText("Successfully Pushed "+value+" to List");
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Enter Only Integer to Push","Error",JOptionPane.WARNING_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Operation--\nSelect Stack For Push Operation","Error Message",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        pop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(stack.isSelected()){
                    int value=list.removeLast();
                    StringBuffer str1=new StringBuffer();
                    str1.append("{ ");
                    for(int i=0;i< list.size();i++){
                        str1.append(list.get(i)+", ");
                    }
                    str1.append("}");
                    field.setText("List-->"+str1.toString());
                    stat.setText("Successfully Popped "+value+" from List");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Operation--\nSelect Stack for Pop Operation","Error Message",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(queue.isSelected()){
                    try{
    int value=Integer.parseInt(JOptionPane.showInputDialog("Enter number add------"));
                    list.add(value);
                    StringBuffer str1=new StringBuffer();
                    str1.append("{ ");
                    for(int i=0;i< list.size();i++){
                        str1.append(list.get(i)+", ");
                    }
                    str1.append("}");
                    field.setText("List-->"+str1.toString());
                    stat.setText("Successfully Added "+value+" to List");

                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Enter Only Integer to Add","Error",JOptionPane.WARNING_MESSAGE);
                    }
                }
                else{
                   JOptionPane.showMessageDialog(null,"Invalid Operation--\nSelect Queue for Add Operation","Error Message",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(queue.isSelected()){
                    int value=list.removeFirst();
                    StringBuffer str1=new StringBuffer();
                    str1.append("{ ");
                    for(int i=0;i< list.size();i++){
                        str1.append(list.get(i)+", ");
                    }
                    str1.append("}");
                    field.setText("List-->"+str1.toString());

                    stat.setText("Successfully Deleted "+value+" from List");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Operation--\nSelect Queue for Delete Operation","Error Message",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
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