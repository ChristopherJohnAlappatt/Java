package Session1;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

//        FOR LOOP BASICS

//        PRINT HELLO WORLD 10 TIMES
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }

        System.out.println("===========================");

//        PRINT NUMBERS FROM 1 TO 10
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("===========================");

//        PRINT TABLE OF 2
        int num = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", num, i, num*i);
            System.out.printf("%d X %d = %d\n", num, i, num*i);
            System.out.println(num+" X "+i+" = "+num*i);
        }

//        Class Assignment -> Print table of number n where n is a number taken as input from the user
        int number ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", number, i, number*i);
        }
    }
}
