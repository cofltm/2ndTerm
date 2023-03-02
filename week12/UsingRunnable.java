package gui;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UsingRunnable implements Runnable{
    
    public static void main(String [] args){
        Thread t1 = new Thread (new UsingRunnable());
        t1.start();
        try {
            t1.sleep(500);
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
        Thread t2 = new Thread (new UsingRunnable());
        t2.start();
        //t2.setDaemon(true);
        
    }
    @Override
    public void run(){
        System.out.println("Running from: "+Thread.currentThread().getName());
    }
}
