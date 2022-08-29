import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.nio.channels.DatagramChannel;

public class serverUdp {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(3456);
        System.out.println("Server Started");
        byte[] b1 = new byte[2000];
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
        ds.receive(dp1);
        String str  = new String(dp1.getData());
        System.out.println(str);

        String msg = "Hii Client";
        byte b[] = msg.getBytes();
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("IP is "+ip);
        DatagramPacket dp2 = new DatagramPacket(b, b.length, ip, 3456);
        ds.send(dp2);

        ds.close();
    }
}
