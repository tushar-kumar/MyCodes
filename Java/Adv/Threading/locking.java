import java.util.concurrent.locks.ReentrantLock;

class A1 {
    ReentrantLock l = new ReentrantLock();
    void printdata(int n) {
        
            // for (int j = 0; j < 10; j++) {
            //     System.out.println(Thread.currentThread().getName()+" "+j);
            // }

        l.lock();
        for (int i = 1; i <= 5; i++) {
            System.out.println("From " + n + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        l.unlock();
        
    }
}

class MyThread1 extends Thread {
    A1 t;
    int n;

    MyThread1(A1 t, int n) {
        this.t = t;
        this.n = n;
    }

    public void run() {
        t.printdata(n);
    }
}

public class locking {

    public static void main(String[] args) {
        A1 ob = new A1();
        // A1 ob1 = new A1();
        MyThread1 t1 = new MyThread1(ob, 1);
        MyThread1 t2 = new MyThread1(ob, 2);

        t1.start();
        t2.start();

    }
}