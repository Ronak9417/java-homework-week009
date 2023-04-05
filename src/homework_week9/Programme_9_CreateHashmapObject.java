package homework_week9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class Programme_9_CreateHashmapObject {
        // Main method
    public static void main(String[] args) {
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<>();
        // Add keys and values
        people.put("Amar", 20);
        people.put("Akbar", 30);
        people.put("Anthony", 40);
        people.put("Danny", 50);
        people.put("Gabber", 60);
        people.put("Chachi", 420);

        Iterator<Map.Entry<String, Integer>> it = people.entrySet().iterator();

        while (it.hasNext()) System.out.println(it.next());

//        for (String i : people.keySet()) {
//            System.out.println("Name:  " + i + "     Age:  " + people.get(i));//
//        }
    }
}
