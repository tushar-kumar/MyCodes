import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udpserver {
    public static void main(String[] args) throws IOException {
        // Step 1 : Create a socket to listen at port 1234
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] receive = new byte[65535];

        DatagramPacket DpReceive = new DatagramPacket(receive, receive.length);

        ds.receive(DpReceive);

        String sdata = new String(DpReceive.getData());
        System.out.println(sdata);


        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;

        String inp = Integer.toString(DpReceive.getLength());

        buf = inp.getBytes();

        DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip,1234);

        ds.send(DpSend);

        System.out.println(DpReceive.getLength());

        ds.close();

    }

}