import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class ConsumerProducer {
    private static Buffer buffer = new Buffer();

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        buffer.set();
        executor.execute(new ProducerTask());
        executor.execute(new ConsumerTask());
        executor.shutdown();
    }

    private static class ProducerTask implements Runnable {
        public void run() {
            try {
                int i = 11;
                while (true) {
                    System.out.println("Produced " + i);
                    buffer.write(i++);
                    Thread.sleep((int)(Math.random()*2000));
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static class ConsumerTask implements Runnable {
        public void run() {

            try {
                while (true) {
                    System.out.println("\t\t\tConsumed " + buffer.read());
                    Thread.sleep((int)(Math.random()*2000));
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static class Buffer {
        private static final int CAPACITY = 10; // buffer size
        private java.util.LinkedList<Integer> queue = new java.util.LinkedList<>();
        
        void set(){
            for(int j=1 ; j<11; j++){
                queue.offer(j);
            }
    
        }
        private static Lock lock = new ReentrantLock();

        private static Condition notEmpty = lock.newCondition();
        private static Condition notFull = lock.newCondition();

        public void write(int value) {
            lock.lock(); 
            try {
                while (queue.size() == CAPACITY) {
                    System.out.println("Wait for notFull condition");
                    notFull.await();
                }

                queue.offer(value);
                notEmpty.signal();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public int read() {
            int value = 0;
            lock.lock();
            try {
                while (queue.isEmpty()) {
                    System.out.println("\t\t\tWait for notEmpty condition");
                    notEmpty.await();
                }

                value = queue.remove();
                notFull.signal();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            finally {
                lock.unlock();
                return value;
            }
        }
    }
}