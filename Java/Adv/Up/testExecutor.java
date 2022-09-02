/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dev
 */
import java.util.concurrent.*;

public class testExecutor {
  public static void main(String[] args) {
    // Create a fixed thread pool with maximum three threads
    ExecutorService executor = Executors.newFixedThreadPool(3);

    // Submit runnable tasks to the executor
    executor.execute(new PrintChar('a', 10));
    executor.execute(new PrintChar('b', 10));
    executor.execute(new PrintNum(10));

    // Shut down the executor
    executor.shutdown();
  }
}

// The thread class for printing a specified character
// in specified times
class PrintChar extends Thread {
  private char charToPrint;  // The character to print
  private int times;  // The times to repeat

  /** Construct a thread with specified character and number of
     times to print the character
    */
  public PrintChar(char c, int t) {
    charToPrint = c;
    times = t;
  }

  /** Override the run() method to tell the system
     what the thread will do
    */
  public void run() {
    for (int i = 0; i < times; i++)
    {
      System.out.print(charToPrint);
    }
    System.out.println();
  }
  
}

// The thread class for printing number from 1 to n for a given n
class PrintNum extends Thread {
  private int lastNum;

  /** Construct a thread for print 1, 2, ... i */
  public PrintNum(int n) {
    lastNum = n;
  }

  /** Tell the thread how to run */
  public void run() {
    for (int i = 1; i <= lastNum; i++)
    {
      System.out.print(" " + i);
    }
    System.out.println();
  }
}
