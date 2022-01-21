package Java_Practicals._3A_1DArray;

import java.util.Scanner;

public class User_defined_1D_Array {
    
   public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
       System.out.println("Enter 5 numbers : ");
       int[] array = new int[5];
       for(int i=0;i<5;i++)
       {
            array[i]=scan.nextInt();
       }
       scan.close();
       for(int i=0;i<5;i++)
       {
            if ((array[i]%2)==0) {
                System.out.println(array[i] +" is even "); 
            }
            
       }
   }
}
