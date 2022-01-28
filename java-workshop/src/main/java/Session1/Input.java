package Session1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Take an Integer Input from USER
        System.out.println("Please enter an Integer number : ");
        int num1 = scanner.nextInt();

        System.out.println("The entered number is -> " + num1);
        System.out.println("=================================");

//        Take a String Input from USER
        System.out.println("Please enter your name : ");
        String name = scanner.next();

        System.out.println("My name is -> " + name);
        System.out.println("=================================");

//        Take a float input from USER
        System.out.println("Please enter a number : ");
        float num2 = scanner.nextFloat();

        System.out.println("The entered number is -> " + num2);
        System.out.println("=================================");

    }
}
