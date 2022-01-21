package Java_Practicals._4A_Single_Level_Inheritance;

public class Triangle extends Polygon {
    
    public int  Area() {
        return (length*breadth)/2;
    }
    Triangle(int l, int b){

        length=l;
        breadth= b;
    }
}
