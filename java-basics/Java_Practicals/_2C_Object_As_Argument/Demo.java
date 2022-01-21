package Java_Practicals._2C_Object_As_Argument;

public class Demo {
    
    public static void main(String[] args) {
        
        Test object = new Test(100, 200);
        System.out.println("The values of a and b before Swapping : "+object.a+" "+object.b);
        object.Swap(object);
        System.out.println("The values of a and b before Swapping : "+object.a+" "+object.b);


    }
}
