package Example;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet of Strings
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");  // Duplicate, will be ignored

        // Displaying the set
        System.out.println("Fruits Set: " + fruits);

        // Checking size
        System.out.println("Set size: " + fruits.size());

        // Checking if an element exists
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Removing an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Iterating through the set
        System.out.println("Iterating:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clearing the set
        fruits.clear();
        System.out.println("Is set empty after clear? " + fruits.isEmpty());
    }
}
