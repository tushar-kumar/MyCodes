/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dev
 */
import javax.swing.*;



public class FlashingText extends JApplet implements Runnable {

  private JLabel jlblText = new JLabel("Welcome", JLabel.CENTER);



  public FlashingText() {

    add(jlblText);

    new Thread(this).start();

  }



  /** Repaint the clock every 200 milliseconds */

  public void run() {

    try {

      while (true) {

        if (jlblText.getText() == null)

          jlblText.setText("Welcome");

        else

          jlblText.setText(null);



        Thread.sleep(200);

      }

    }

    catch (InterruptedException ex) {

    }

  }



  /** Main method */

  public static void main(String[] args) {

    SwingUtilities.invokeLater(new Runnable() {

      public void run() {

        JFrame frame = new JFrame("FlashingText");

        frame.add(new FlashingText());

        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(200, 200);

        frame.setVisible(true);

      }

    });

  }

}
