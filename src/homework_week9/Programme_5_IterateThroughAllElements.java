package homework_week9;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

public class Programme_5_IterateThroughAllElements {

    public static void main(String[] args) {
        // Create a HashMap object called myColours
        ArrayList<String> myColours = new ArrayList<>();
        // Add keys and values (colour)
        myColours.add("Blue");
        myColours.add("Red");
        myColours.add("Green");
        myColours.add("Yellow");
        myColours.add("Purple");
        myColours.add("Black");
        myColours.add("Orange");

        ListIterator<String> iterator = myColours.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
