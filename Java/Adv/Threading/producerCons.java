import java.util.concurrent.ArrayBlockingQueue;

public class producerCons {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> bQ = new ArrayBlockingQueue<>(4);
        producer p1 = new producer(bQ);
        consumer c1 = new consumer(bQ);
        p1.start();
        c1.start();
    }
}

class producer extends Thread{
    ArrayBlockingQueue<Integer> obj;
    producer(ArrayBlockingQueue<Integer> obj){
        this.obj = obj;
    }
    @Override
    public void run() {
        int i = 1;
        while (true) {
            try {
                System.out.println("Produced: "+i);
                obj.put(i);
                Thread.sleep(3000);
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class consumer extends Thread{
    ArrayBlockingQueue<Integer> obj;
    consumer(ArrayBlockingQueue<Integer> obj){
        this.obj = obj;
    }
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumed: "+obj.take());
                Thread.sleep(4000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}