package Session2;

public class Review {
    public static void main(String[] args) {

//        print a line
        System.out.println("Hello  World");
        System.out.println("==============");
//        variable declaration
        int a = 10;
        float b = 10.0f;
        char c = 'a';
        boolean d = true;
        String s = "Christopher";

//        operators

        int num1 = 4;
        int num2 = 2;
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int division = num1 / num2;
        int remainder = num1 % num2;

        System.out.println(sum + "\n" + diff + "\n" + product + "\n" + division + "\n" + remainder);
        System.out.println("==============");

//         prefix and suffix operators
        System.out.println("Let us try out x++ operator");
        int x = 2;
        System.out.println("x : " + x);
        System.out.println("x++ : " + (x++)); //The value of x is incremented after printing
        System.out.println("The value of x after carrying out x++ : " + x);
//        Now the value of x is 3

        System.out.println("Let us try out ++x operator");
        System.out.println("++x : " + (++x)); //The value of x is incremented before printing
        System.out.println("The value of x after carrying out ++x : " + x);
//        Now the value of x is 4

        System.out.println("Let us try out x-- operator");
        System.out.println("x : " + x);
        System.out.println("x-- : " + (x--)); //The value of x is decremented after printing
        System.out.println("The value of x after carrying out x-- : " + x);
//        Now the value of x is 3

        System.out.println("Let us try out --x operator");
        System.out.println("--x : " + (--x)); //The value of x is decremented before printing
        System.out.println("The value of x after carrying out --x : " + x);
//        Now the value of x is 2

        System.out.println("==============");
//        conditional statements
        if (a > 5) {
            System.out.println("The number is greater than 5");
        } else {
            System.out.println("The number is less than 5 ");
        }


    }
}
