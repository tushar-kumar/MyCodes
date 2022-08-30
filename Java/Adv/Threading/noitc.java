public class noitc {
    public static void main(String[] args) throws InterruptedException{
        B ob = new B();
        ob.start();
        // Thread.sleep(3000);
        System.out.println(ob.sum);
    }
}

class B extends Thread{
    int sum;
    public void run(){
        for (int i = 1; i <= 100; i++) {
            sum=sum+i;
        }
    }
}
