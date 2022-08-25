
import java.io.*;

public class Except {
  void readLine(File f) throws IOException {
    FileReader r = new FileReader(f);
    BufferedReader b = new BufferedReader(r);
    System.out.println(b.readLine());
  } 

  void fileExist() throws IOException {
    File f = new File("Filename.txt");
    readLine(f);
  }

  public static void main(String[] a) {
    try {
      Except e = new Except();
      e.fileExist();
    } catch (Exception ex) {
      System.out.println(ex);
    } finally {
        System.out.println("\nI am finally I will print always !!!");
    }
  }
}