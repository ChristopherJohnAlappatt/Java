package Multithreading_in_Java;

public class Hello extends Thread {

    public synchronized void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(("Hello"));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}
