package Session1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCase {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//         IF-ELSE implementation

        System.out.println("This is if-else implementation");

        System.out.println("Enter a day of the week : ");
        int weekDay = scanner.nextInt();

        if (weekDay == 1) {
            System.out.println("Monday");
        } else if (weekDay == 2) {
            System.out.println("Tuesday");
        } else if (weekDay == 3) {
            System.out.println("Wednesday");
        } else if (weekDay == 4) {
            System.out.println("Thursday");
        } else if (weekDay == 5) {
            System.out.println("Friday");
        } else if (weekDay == 6) {
            System.out.println("Saturday");
        } else if (weekDay == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Please Enter a number between 1 to 7");
        }

        System.out.println("======================================");

//        SWITCH CASE Implementation
        System.out.println("This is Switch case implementation");

        System.out.println("Enter a day of the week : ");
        weekDay = scanner.nextInt();

        switch (weekDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input , PLease enter a number between 1 and 7 ");
                break;

        }

        System.out.println("======================================");

        System.out.println("Enter the students grade : ");
        char grade = scanner.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}
