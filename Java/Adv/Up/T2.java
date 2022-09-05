
class T2 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
T2 newThread=new T2();  
Thread t1 =new Thread(newThread);  
t1.start();  
 }  
}  