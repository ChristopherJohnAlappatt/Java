public class Method_Overloading {
    public static void main(String[] args) {
        System.out.println(add(1.0,2.0));
        System.out.println(add("Hello","World"));
    }
    public static int add(int a, int b){
        return(a+b);
    }
    public static String add(String a, String b){
        return(a+" "+b);
    }
    public static double add(double a, double b){
        return(a+b);
    }
}
