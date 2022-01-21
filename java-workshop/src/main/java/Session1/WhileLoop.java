package Session1;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

//        FOR WHILE BASICS

//        PRINT HELLO WORLD 10 TIMES
        int counter = 10;
        while (counter > 0) {
            System.out.println("Hello World");
            counter--;
        }

        System.out.println("===========================");

//        PRINT NUMBERS FROM 1 to 10
        counter = 1;
        while (counter <= 10) {
            System.out.println(counter++);
        }

        System.out.println("===========================");

//        INFINITE WHILE LOOP
        while (true) {
            System.out.println("infinitive while loop");
            break;
        }

//        Class Assignment -> Print all even of numbers till n where n is a number taken as input from the user
        int number;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = scanner.nextInt();

        while (true) {
            if (count <= number) {
                if (count % 2 == 0) {
                    System.out.printf("%d is Even \n", count);
                } else {
                    System.out.printf("%d is Odd \n", count);
                }
                count++;
            } else {
                break;
            }
        }

    }
}
