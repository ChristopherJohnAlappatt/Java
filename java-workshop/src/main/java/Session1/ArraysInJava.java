package Session1;

import java.util.Arrays;

public class ArraysInJava {

    public static void main(String[] args) {

        String[] colors = new String[5];
        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "green";
        colors[3] = "orange";
        colors[4] = "black";

//        LENGTH OF THE ARRAY
        int length = colors.length;
        System.out.println("Length of the array is -->" + length);

//        ACCESS ANY ELEMENT OF THE ARRAY
        System.out.println("Accessing elements of the array");
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);

//         ACCESS ELEMENTS OF THE ARRAY USING FOR LOOP
        System.out.println("Accessing elements of the array using For Loop");
        for (int i = 0; i < length; i++) {
            System.out.println(colors[i]);
        }

//        ACCESS ELEMENTS OF THE ARRAY USING FOR EACH
        System.out.println("Accessing elements of the array using For Each");
        for (String color : colors) {
            System.out.println(color);
        }

//    PRINT ALL ELEMENTS OF THE ARRAY
        System.out.println("Printing all  elements of the array using Arrays.toString()");
        System.out.println(Arrays.toString(colors));


        int [] numberArray = {1,2,3,4,5};
        String [] cars = {"Mercedes" , "BMW", "Ferrari"};
        System.out.println(Arrays.toString(numberArray));
        System.out.println(Arrays.toString(cars));
    }
}
