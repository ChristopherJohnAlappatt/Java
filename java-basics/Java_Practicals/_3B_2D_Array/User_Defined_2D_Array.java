package Java_Practicals._3B_2D_Array;

import java.util.Scanner;

public class User_Defined_2D_Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of matrix Array1: ");
        int i,j;
        int [][]array1= new int[3][3];
        for(i=0;i<3;i++){
            for ( j = 0; j<3 ; j++) {
                array1[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix Array2: ");
        //int i,j;
        int [][]array2= new int[3][3];
        for(i=0;i<3;i++){
            for ( j = 0; j<3 ; j++) {
                array2[i][j]=scan.nextInt();
            }
        }
        scan.close();

        int [][] array3= new int[3][3];
        for(i=0;i<3;i++){
            for ( j = 0; j<3 ; j++) {
                array3[i][j]=array1[i][j] + array2[i][j];
            }
        }

        System.out.println(" The Sum of Array 1 and Array 2 is : ");
        for(i=0;i<3;i++){
            for ( j = 0; j<3 ; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}