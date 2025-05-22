package Example;

import java.util.LinkedList;

public class linklist {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Adding at specific position
        fruits.add(1, "Blueberry");
        
        System.out.println("Fruits list: " + fruits);
        // Removing at First
        System.out.println("Removing First Fruits: " + fruits.removeFirst());
        System.out.println("Fruits list After Removing First: " + fruits);
        // Removing an element
        fruits.remove("Banana");

        // Printing the list
        System.out.println("Fruits list After Removing Banana: " + fruits);
        fruits.clear();
        System.out.println("Fruits list After Clear All: " + fruits);
    }
}
