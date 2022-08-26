
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class udpclient {
    public static void main(String args[]) throws IOException {

        // Step 1:Create the socket object for
        // carrying the data.
        DatagramSocket ds = new DatagramSocket();

        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;

        JFrame f = new JFrame();
        String inp = JOptionPane.showInputDialog(f, "Enter Name");

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buf = inp.getBytes();

        DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234);

        ds.send(DpSend);

        byte[] receive = new byte[65535];

        DatagramPacket DpReceive = new DatagramPacket(receive, receive.length, ip, 1234);

        ds.receive(DpReceive);

        String sdata = new String(DpReceive.getData());

        ds.close();
        System.out.println(sdata);

    }
}