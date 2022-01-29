package Session2;

public class Methods {
    public static void main(String[] args) {

        printHelloWorld();
        printWelcomeMessage("Laurel");
        printMessageMultipleTimes("FCRIT is the best college in Navi Mumbai " , 3);
        printNameAndAge("Christopher", 20);
        int sum = sumOfTwoNumbers(2, 3);
        System.out.println("\nSum --> " + sum);
    }

    //    Methods with 0 parameter and return type void
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    //    Methods with 1 parameter and return type void
    public static void printWelcomeMessage(String name) {
        System.out.println("CSI FCRIT welcomes " + name);
    }


    //    Methods with 2 parameter and return type void
    public static void printNameAndAge(String name, int age) {
        System.out.printf("%s is %d year old ", name, age);
    }

    public static void printMessageMultipleTimes(String s , int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    //    Methods with 2 parameter and return type int
    public static int sumOfTwoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

//    Method Overloading
}
