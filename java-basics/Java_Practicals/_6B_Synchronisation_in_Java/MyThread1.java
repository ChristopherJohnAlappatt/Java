package Java_Practicals._6B_Synchronisation_in_Java;

public class MyThread1 extends Thread {
    
    Table t = new Table();

    MyThread1(Table t){
         this.t=t;
    }
    public void run() {
        t.PrintTable(5);
    }
}
