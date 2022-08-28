
class A1 {
    synchronized void printdata(int n) {
        for (int i = 0; i < 5; i++) {
            System.out.println("From " + n + ": " + i);
            try {
                // Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
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

public class synchdemo {

    public static void main(String[] args) {
        A1 ob = new A1();
        // A1 ob1 = new A1();
        MyThread1 t1 = new MyThread1(ob, 1);
        MyThread1 t2 = new MyThread1(ob, 2);

        t1.start();
        t2.start();

    }
}