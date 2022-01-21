package Multithreading_in_Java;

public class Hi extends Thread{
    
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(("Hi"));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        
    }
}
