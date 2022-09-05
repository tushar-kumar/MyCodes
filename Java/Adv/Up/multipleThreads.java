/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dacharya
 */
public class multipleThreads {

    public static void main(String args[]) {


      //create object of type thread1. this is a runnable object
      thread1 runnable = new thread1();

      // Create the thread and supply it with the runnable object
      Thread t1 = new Thread(runnable);


      // Create thread object of type thread2
      thread2 t2 = new thread2();

      t1.start();
      t2.start();

    }

  

}

class thread1 implements Runnable {

         // This method is called when the thread runs
          public void run()
        {
            for(int i=2;i<=10; i+=2)
            {
                System.out.print(i+ ", ");
                
                try {
                Thread.sleep(500);    
                } catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

            }
        }

}

class thread2 extends Thread {

   // This method is called when the thread runs
    public void run()
    {
        for(int i=1;i<=10; i+=2)
            {
                System.out.print(i+ ", ");
                 try {
                Thread.sleep(500);
                } catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

            }
    }
}