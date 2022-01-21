package Java_Practicals;

import java.util.Scanner;

public class _1B_Looping_Statements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= scan.nextInt();
        scan.close();
        System.out.println("The table of "+n+" is as follows :");
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}
