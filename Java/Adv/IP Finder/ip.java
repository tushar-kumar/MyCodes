import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class ip extends JFrame {
    JOptionPane jp;

    ip() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            String url = jp.showInputDialog("Enter Url");
            InetAddress ia = InetAddress.getByName(url);
            String ip = ia.getHostAddress();
            JOptionPane.showMessageDialog(this, "Host name is: " + url + "\nIP Address is: " + ip);
        } catch (UnknownHostException e1) {
            JOptionPane.showMessageDialog(this, "Unknown host or IP address");
        }
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ip();
    }
}