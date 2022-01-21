package bootstrap;

import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {
        System.out.println("This is a Calculator Program ");
        Scanner scanner = new Scanner(System.in);

        float num_1;
        float num_2;
        int choice = -1;

        while (choice != 5) {

            System.out.println("\nEnter 1st number:");
            num_1 = scanner.nextInt();
            System.out.println("Enter 2nd number:");
            num_2 = scanner.nextInt();

            System.out.println("\nPress");
            System.out.println("1. to perform Addition");
            System.out.println("2. to perform Subtraction");
            System.out.println("3. to perform Multiplication");
            System.out.println("4. to perform Division");
            System.out.println("5. to Exit");

            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    float result=Math.round(num_1+num_2);
                    System.out.format("The sum of %.2f and %.2f is %.2f", num_1, num_2 , result);
                    break;

                case 2:
                    System.out.printf("The subtraction of %f and %f is %f", num_1, num_2, num_1 - num_2);
                    break;
                case 3:
                    System.out.printf("The product of %f and %f is %f", num_1, num_2, num_1 * num_2);
                    break;
                case 4:
                    System.out.printf("The division of %f and %f is %f", num_1, num_2, num_1 / num_2);
                    break;
                case 5:
                    System.out.printf("Exiting Program ...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please enter valid input");
                    break;
            }
        }
    }

   
}

