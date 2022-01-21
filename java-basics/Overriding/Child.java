package Overriding;

public class Child extends Parent{
    //OVERRIDING METHOD 
    public void Mobile() {
        
        System.out.println("I have to attend my online class .");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.Mobile();
        c.Dinner();
    }
}
