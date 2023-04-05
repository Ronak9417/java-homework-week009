package homework_week9;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_NewArrayList {

    // Main method
    public static void main(String[] args) {
        // Create a HashMap object called fruit
        ArrayList<String> fruit = new ArrayList<>();
        // Add keys and values (Fruit name)
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Grapes");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Watermelon");

        for (String iLikeFruit : fruit) {

            System.out.println(iLikeFruit);

        }
    }
}
