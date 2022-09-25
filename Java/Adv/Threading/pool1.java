
import java.util.concurrent.*;

public class pool1 {

    static int sum = 0;

    public static void main(String[] args) {


        System.out.println("Name: Priyanshu Mittal \t SAP ID: 1000013921");

        ExecutorService myPool = Executors.newFixedThreadPool(1000);

        for (int i = 0; i < 1000; i++)
            myPool.execute(new tpool());

        myPool.shutdown();
        while (!myPool.isTerminated());
        System.out.println("SUM = " + sum);

    }

    private static class tpool implements Runnable {

        public void run() {
            sum++;
        }
}

}