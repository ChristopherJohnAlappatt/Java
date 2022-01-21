package Constructors;

public class My_class {
    
    public static void main(String[] args) {
        Cube cube1= new Cube();
        System.out.println(cube1.GetVolumeCube()); 
        Cube cube2 = new Cube(2,2,2);
        System.out.println(cube2.GetVolumeCube());      
    }



}
