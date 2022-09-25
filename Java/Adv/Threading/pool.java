import java.util.concurrent.*;

public class pool {
  static int sum = 0;

  public static void main(String[] args) 
  {
    System.out.println("Programmer: Rishi Dwivedi  SAPID: 1000014215  Roll_no: 200102033");
    pool test = new pool();
    System.out.println("The Value of sum is " + test.sum);
  }

  public pool() {
    ExecutorService mypool = Executors.newFixedThreadPool(1000);

    for (int i = 0; i < 1000; i++) {
      mypool.execute(new SumTask());
    }

    mypool.shutdown();

    while(!mypool.isTerminated()) {
    }
  }

  class SumTask implements Runnable {
    public void run() {
      sum++;
//      int value = sum.intValue() + 1;
//      sum = new Integer(value);
    }
  }
}