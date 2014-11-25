/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.Calendar;

/**
 *
 * @author T107
 */
public class Aplicacionthreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Thread t1= new Thread (new Runnable (){

            @Override
            public void run() {
            while(true){
            try {
              Calendar cal= Calendar.getInstance();
              int hora= cal.get(Calendar.HOUR_OF_DAY);
              int min=  cal.get(Calendar.MINUTE);
              int seg=  cal.get(Calendar.SECOND);
              System.out.println(hora+":"+min+":"+seg);
              Thread.sleep(1000);
                }catch (Exception e){}
            } //Aqui termina  while   
                
                
            }
        });//Aqui termina el thread
            
            System.out.println("Este es solo el metodo main");
            t1.start();

        }
                }

