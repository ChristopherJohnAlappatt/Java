package Java_Practicals._4D_Dynamic_Method_Dispatch;

public class Dispatch {
    
    public static void main(String[] args) {
        
        Class_A a =new Class_A();
        Class_B b =new Class_B();
        Class_C c =new Class_C();
        Class_A r;
        r=a;
        r.Show();
        r=b;
        r.Show();
        r=c;
        r.Show();
    }
}
