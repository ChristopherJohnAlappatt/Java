package Java_Practicals._4A_Single_Level_Inheritance;

public class Rectangle  extends Polygon{
    
    public int  Area() {
        return (length*breadth);
    }

    Rectangle(int l, int b){

        length=l;
        breadth= b;
    }
}
