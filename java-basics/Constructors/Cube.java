package Constructors;

public class Cube {
      
        int length;
        int breadth;
        int height;

        public int GetVolumeCube() {
            return (length*breadth*height);
        }
       Cube(){
        System.out.println("We are in the constructor");
        length=10;
        breadth=20;
        height=30;
       }
       //CONSTRUCTOR OVERLOADING
       Cube(int l, int b, int h){
        length=l;
        breadth=b;
        height=h;
       }


 
}
