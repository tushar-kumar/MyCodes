class simplethread extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+" Task - "+i);
        }
    }
    public static void main(String[] args) {
        simplethread t1 = new simplethread();
        t1.start();
        simplethread t2 = new simplethread();
        t2.start();

        System.out.println("Name: TUSHAR KUMAR \t SAP ID: 1000014268");
    }
}
