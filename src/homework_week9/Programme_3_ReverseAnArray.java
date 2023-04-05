package homework_week9;

import java.util.Arrays;
import java.util.Collections;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseAnArray {

    //  reverses the elements of the array
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
    // Main Method
    public static void main(String[] args){

        Integer [] arr = {10, 20, 30, 40, 50};
        //Print Original array list
        System.out.println("Original array list : " + Arrays.toString(arr));
        // Print blank
        System.out.println(" ");
        // Print reversed array list
        System.out.print("Reversed Array List : ");
        reverse(arr);
    }

}
