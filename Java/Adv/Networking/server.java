// package networking;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;

public class server {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(4444);
        Socket s = ss.accept();
        System.out.println("Connection Established.....");
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        pw.println("Hello Clent...");
        pw.flush();

        InputStreamReader isr =  new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(isr);
        int r = Integer.parseInt(br.readLine());
        double d = 3.14 * r * r;
        String smsg = Double.toString(d);
        System.out.println("Checks...");
        PrintWriter pws = new PrintWriter(s.getOutputStream());
        pws.println(smsg);
        pws.flush();
        s.close();
    }
}
