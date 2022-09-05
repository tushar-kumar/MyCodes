/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dev
 */
public class T1 extends Thread{
public void run(){  
System.out.println("thread created using thread class");  
}  
public static void main(String args[]){  
T1 t1=new T1();  
t1.start();  
 }  
    
}
