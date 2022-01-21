package Java_Practicals;

import java.util.Scanner;

public class _1A_User_Input {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of the Square / Cube : ");
        int side = scan.nextInt();
        scan.close();
        System.out.println("The area of the square is "+side*side);
        System.out.println("The Volume of the Cube is "+ side*side*side);
    }
}
