package Java_Practicals._2A_Constructor_Overloading;

public class Cube {
    
    int length,breadth,height;

    public int  GetVolume() {
        return (length*breadth*height);
    }
    Cube(){
        length=10;
        breadth=20;
        height=30;
        
    }
    Cube(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
        
    }      

}
