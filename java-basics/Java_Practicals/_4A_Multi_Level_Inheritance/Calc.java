package Java_Practicals._4A_Multi_Level_Inheritance;

public class Calc {
    
    public static void main(String[] args) {
        AddSubMul object = new AddSubMul();
        
        System.out.println("The product of 2 and 3 is : "+ object.Product(2, 3));
        System.out.println("The Sum of 2 and 3 is : " + (object.Sum(2, 3)));
        System.out.println("The Difference of 2 and 3 is : "+ object.Difference(2, 3));
    }
}
