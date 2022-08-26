import java.beans.IntrospectionException;

public class itc {
    public static void main(String[] args) throws InterruptedException{
        thdemo ob = new thdemo();
        ob.start();
        synchronized(ob){
            System.out.println("Main thread Calling wait method");
            ob.wait();
            System.out.println("Main thread got notified");
            System.out.println(ob.sum);
        }
    }
    
}

class thdemo extends Thread{
    int sum;
    public void run() {
        synchronized(this){
            System.out.println("Child thread start execution");
            for (int i = 1; i <= 100; i++) {
                sum = sum + i;
            }
            System.out.println("Child thread send notification to maian thread");
            this.notify();
        }
    }
}