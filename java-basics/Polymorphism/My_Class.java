package Polymorphism;

public class My_Class {
    
    public static void main(String[] args) {
        Bank abc = new Bank_ABC();
        Bank def = new Bank_DEF();
        Bank xyz = new Bank_XYZ();

        System.out.println(abc.GetInterestRate());
        System.out.println(def.GetInterestRate());
        System.out.println(xyz.GetInterestRate());
    }
}
