import java.awt.event.*;
import javax.swing.*;

public class Swing {

    public static void main(String[] args) {
        
        JFrame f = new JFrame("Atul's JFrame");
        final JTextField tf = new JTextField();
        tf.setBounds(50,50,150,40);

        JButton b = new JButton(new ImageIcon("C:\\Users\\KIYO\\Desktop\\27\\insta.png"));// creating instance of JButton
        b.setBounds(60, 100, 120, 120);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome My Lord");
            }
        });

        f.add(b); f.add(tf);

        f.setSize(400, 400);// 400 width and 500 height
        f.setLayout(null);// using no layout managers
        f.setVisible(true);// making the frame visible

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}