import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the number : ");
     int User_input_number = scan.nextInt();
     System.out.println("The entered number is :"+ User_input_number);
     System.out.println("Enter a String : ");
     scan.next();
     String a = scan.next();
     System.out.print("The entered String is ");
     System.out.print(a);
     scan.close();
 }
}
