import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.nio.channels.DatagramChannel;

public class clientUdp {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();

        String msg = "Hii Server...";
        byte b[] = msg.getBytes();
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("IP is "+ip);
        DatagramPacket dp = new DatagramPacket(b, b.length, ip, 3456);
        ds.send(dp);

        byte[] b1 = new byte[2000];
        DatagramPacket dp3 = new DatagramPacket(b1, b1.length);
        ds.receive(dp3);
        
        String str  = new String(dp3.getData());
        

        ds.close();

        System.out.println(str);
    }
    
}
