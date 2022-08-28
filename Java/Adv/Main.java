import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        // readCatch();
        try {
            readThrows();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void readThrows() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("Filename.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void readCatch() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Filename.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally.");
        }
    }
}