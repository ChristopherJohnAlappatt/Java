package Java_Practicals._6B_Synchronisation_in_Java;

public class TestSynchronisation {
    
    public static void main(String[] args) {
        
        Table t = new Table();
        MyThread1 object1= new MyThread1(t);
        MyThread2 object2= new MyThread2(t);

        object1.start();
        object2.start();
    }
}
