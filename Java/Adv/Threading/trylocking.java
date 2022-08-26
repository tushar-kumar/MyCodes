import java.util.concurrent.locks.ReentrantLock;

class trylock  extends Thread{
    static ReentrantLock l = new ReentrantLock();

    public void run() {
        if (l.tryLock()) {
            System.out.println(Thread.currentThread().getName()+ " got the lock");
            try {
                Thread.sleep(4000);
            } catch (Exception e) {}
            l.unlock();
        }
        else{
            System.out.println(Thread.currentThread().getName()+" not got lock");
        }
        
    }
    
}

public class trylocking {
    public static void main(String[] args) {
        trylock t1 = new trylock();
        trylock t2 = new trylock();
        t1.start();
        t2.start();
    }
}
