package Java_Practicals._5A_Try_Catch_Throw;

import java.util.Scanner;

public class Throws {
    
    public static void main(String[] args) throws ArithmeticException {
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your level : ");
       int n = scan.nextInt();
       scan.close();
       if (n<5) {
           
        throw new ArithmeticException(" You are a Noob !!!");

       } 
       else {
           
        System.out.println("Congratulations!! You are a pro now ");

       }
    }
}
