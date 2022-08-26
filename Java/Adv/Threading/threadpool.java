import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * a2 implements Runnable
 */
class a2 implements Runnable {
    String name;
    a2(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name+" ...Started by... - "+Thread.currentThread().getName());
        // for (int i = 1; i < 5; i++) {
        //     System.out.println(i);
        // }
        System.out.println(name+" ...Completed by... - "+Thread.currentThread().getName());
    }
}

public class threadpool {
    public static void main(String[] args) {
        ExecutorService serv = Executors.newFixedThreadPool(2);
        serv.submit(new a2("ABC1"));
        serv.submit(new a2("ABC2"));
        serv.submit(new a2("ABC3"));
        serv.submit(new a2("ABC4"));
        serv.shutdown();
    }
}
