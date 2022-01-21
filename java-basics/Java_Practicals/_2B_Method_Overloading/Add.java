package Java_Practicals._2B_Method_Overloading;

public class Add {
    
    public int Addition(int a, int b) {
        return (a+b);
    }
    public String Addition(String a , String b)
    {
        return (a+b);
    }
    public  static void main(String[] args) {
        Add object = new Add();
        System.out.println(object.Addition(1,3));
        System.out.println(object.Addition("Hello ", "World"));
    }
}
