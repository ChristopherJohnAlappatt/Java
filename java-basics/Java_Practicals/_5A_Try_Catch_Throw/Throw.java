package Java_Practicals._5A_Try_Catch_Throw;

import java.util.Scanner;

public class Throw {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = scan.nextInt();
        scan.close();
        if (age<18) {
            
            throw new ArithmeticException("Not eligible for driving ...");

        } else {
            System.out.println("Eligible to drive ...");
        }
        
    }
}
