package Java_Practicals._6B_Synchronisation_in_Java;

public class MyThread2 extends Thread {
    
    Table t = new Table();

    MyThread2(Table t){
        this.t = t;
    }
    public void run() {
        t.PrintTable(100);
    }
}
