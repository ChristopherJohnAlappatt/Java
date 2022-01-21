package Inheritance;

public class My_Class {
    
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();
        
        rec.Set_Values(20, 10);
        tri.Set_Values(30, 30);

        System.out.println("The area of the rectangle is "+ rec.Area());
        System.out.println("The area of the Trinagle is "+ tri.Area());
    }
    
}
