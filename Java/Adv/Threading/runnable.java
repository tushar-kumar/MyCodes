

public class runnable implements Runnable{
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        runnable ob = new runnable();
        // runnable ob1 = new runnable();
        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob);
        t1.start();
        t2.start();
        // t1.run();
        // t2.run();
    }
    
}
