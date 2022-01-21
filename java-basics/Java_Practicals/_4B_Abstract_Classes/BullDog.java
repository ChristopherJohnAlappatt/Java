package Java_Practicals._4B_Abstract_Classes;

public class BullDog extends Dog {
    
    public void run(){
        System.out.println("Run...");
    }
    public void eat(){
        System.out.println("Eat...");
    }
    public static void main(String[] args) {
        BullDog d = new BullDog();
        d.bark();
        d.run();
        d.eat();
    }
}
