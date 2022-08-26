// package networking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.PrintWriter;

public class client {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost",4444);
        InputStreamReader isr =  new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(isr);
        String msg = br.readLine();
        System.out.println(msg);

        PrintWriter pw = new PrintWriter(s.getOutputStream());
        pw.println("20");
        pw.flush();

        InputStreamReader isr1 =  new InputStreamReader(s.getInputStream());
        BufferedReader brr = new BufferedReader(isr1);
        String msgr = brr.readLine();
        System.out.println(msgr);
        
        s.close();
    }
}
