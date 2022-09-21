
import javax.swing.*;
import java.awt.*;
public class borderdemo 
{
  JFrame f; 
    borderdemo() 
    {
    
   
    f = new JFrame();    
        
     // creating buttons  
    JButton b1 = new JButton("CENTER");
    JButton b2 = new JButton("SOUTH");
    JButton b3 = new JButton("EAST");
    JButton b4 = new JButton("WEST");
    JButton b5 = new JButton("NORTH"); 
    
      f.setLayout(new BorderLayout());      
    
    //f.add(b1,BorderLayout.CENTER ); 
    //f.add(b2, BorderLayout.SOUTH);      
    f.add(b3, BorderLayout.EAST );    
    f.add(b4, BorderLayout.WEST );    
    //f.add(b5, BorderLayout.NORTH);     
      
    f.setSize(300, 300); 
    
    f.setVisible(true);    
    
    }
    
    public static void main(String[] args) {
        new borderdemo();
    }



}
