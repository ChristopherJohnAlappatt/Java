package Java_Practicals._6B_Synchronisation_in_Java;

public class Table  {

    synchronized void PrintTable(int n) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
                
    }
}
}