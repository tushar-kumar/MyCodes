import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class pool2 {
    Integer sum = new Integer(0); 
    public static void main(String [] args){
        pool2 t = new pool2();
        System.out.println("sum : "+ t.sum);
    }

    public pool2(){
        ExecutorService myPool = Executors.newFixedThreadPool(1000);
        for(int i = 0; i<1000; i++){
            myPool.execute(new X());
        }
        myPool.shutdown();
    }


    class X implements Runnable{
        synchronized public void run(){
            sum++;
        }
    }
}
