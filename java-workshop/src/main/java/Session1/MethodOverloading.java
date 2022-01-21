package Session1;

public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println(add(2,3));
        System.out.println(add(4.568,3.98));
        System.out.println(add("hello","world"));
    }

    static int add(int x, int y) {
        return x + y;
    }

    static double add(double x, double y) {
        return x + y;
    }

    static String add(String s1, String s2) {
        return s1 + s2;
    }
}

