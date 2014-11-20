/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forma2InterfazRunnable;

/**
 *
 * @author T203
 */
public class MiThread2 implements Runnable{
     
    public static void main (String arg[]){
        
        Runnable r=new MiThread2();
        Thread t1=new Thread(r); 
        t1.start();
    } 
    
    public void run (){System.out.println("Soy un thread");}
}

