package Java_Practicals._6A_Multithreading;

public class Multithread extends Thread {
    public void run() {
        //System.out.println("Hello");
        try {
            
            System.out.println ("Thread " + Thread.currentThread().getId() + " is running");

        } 
        catch (Exception e) {
            System.out.println("Error occured !!!");
        }
        
    }

}
