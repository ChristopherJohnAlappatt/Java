public class Method {
    public static void main(String[] args) {
        SayHello("John");

        int x=1,y=2;
        System.out.println(Addition(x, y));
    }
    public static void SayHello(String name) {
        System.out.println("Hello " + name);
    }
    public static int Addition(int a, int b)
    {
       int c= a+b;
        return c;
    }
}
