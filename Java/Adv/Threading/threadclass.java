
class A extends Thread {
    int n;
    public void run(){
        for (int i = 1; i < 5; i++) {
            System.out.println("From thread "+n+": "+i);
        }
    }
    A(int n){
        this.n=n;
    }
}


public class threadclass{
    // int n;
    // public void run(){
    //     for (int i = 1; i < 5; i++) {
    //         System.out.println("From thread "+n+": "+i);
    //     }
    // }

    // threadclass(int n){
    //     this.n=n;
    // }
    public static void main(String[] args) {
        A ob = new A(1);
        A ob1 = new A(2);

        // threadclass ob = new threadclass(1);
        // threadclass ob1 = new threadclass(2);

        ob.start();
        ob1.start();

    }
}
