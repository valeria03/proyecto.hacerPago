/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternas3;

/**
 *
 * @author T203
 */
public class MiThread3 {

        public static void main (String args[]){
            Thread t1=new Thread ((new Runnable(){
                public void run (){
                    System.out.println("Soy un Thread Bueno");
                    
                }
            }));
            t1.start();
        }
}
