package homework_week9;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink")
 */
public class Programme_11_CompareTwoArraylist {

    public static void main(String[] args) {


        //First arraylist
        ArrayList<String> c1 = new ArrayList<String>();
        // Add keys and values (colour)
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("First array list : " + c1);

        //Second array list
        ArrayList<String> c2 = new ArrayList<String>();
        // Add keys and values (colour)
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("Second array list : " + c2);
        //Blank space print
        System.out.println();

        //returns the common elements from both list
        System.out.println("Common elements: " +c1.stream().filter(c2::contains).collect(Collectors.toList()));

        c1.removeAll(c2);
        //print un-common element from both list
        System.out.println("Un-common element from both arraylist: " + c1);
    }
    }

