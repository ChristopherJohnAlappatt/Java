package Java_Practicals._6A_Multithreading;

public class MultithreadDemo {
    
    public static void main(String[] args) {
        
        for(int i=0;i<10;i++){
        Multithread object = new Multithread();
        object.start();
        }
    }
}
