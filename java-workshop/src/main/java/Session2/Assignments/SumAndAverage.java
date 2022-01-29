package Session2.Assignments;

import java.util.Arrays;
import java.util.Scanner;


//        Compute Sum and Average of Array Elements
public class SumAndAverage {
    public static void main(String[] args) {
        int arrayLength;
        int arrSum = 0;
        double arrAvg = 0;

//        Take array input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array -->");
        arrayLength = scanner.nextInt();

        int[] arr = new int[arrayLength];
        System.out.println("Enter Array elements here --> \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element %d :", i + 1);
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

//        CALL CALCULATE SUM FUNCTION HERE

        arrSum = calculateSum(arr);
        System.out.println("The Sum of the Array is --> " +arrSum);

//        CALL CALCULATE AVERAGE FUNCTION HERE
        arrAvg=(double)arrSum/arrayLength;
        System.out.println("The Average of the Array is --> " +arrAvg);

    }

    public static int calculateSum(int[] numArr) {
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum = sum + numArr[i];
        }
        return sum;
    }

}
