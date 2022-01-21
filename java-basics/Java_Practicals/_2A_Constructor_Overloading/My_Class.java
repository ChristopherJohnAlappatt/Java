package Java_Practicals._2A_Constructor_Overloading;

public class My_Class {
    public static void main(String[] args) {
        
        Cube cube1=new Cube();
        Cube cube2=new Cube(2,2,2);
        System.out.println("The Volume of the cube 1 is : " + cube1.GetVolume());
        System.out.println("The Volume of the cube 2 is : " + cube2.GetVolume());
    }
}
