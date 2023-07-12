import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        Set<String> set = new LinkedHashSet<>();

        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Adding a duplicate element

        // Print the set
System.out.println("\nNAME : KISHOR VINOD");
System.out.println("\nREG NO :SJC22MCA-2035");
System.out.println("\nDATE : 26-06-2023");
System.out.println("\nCOURSE CODE : 20MCA132");
System.out.println("\nCOURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("-----------OUTPUT---------");
        System.out.println("Set elements: " + set);

        // Check if an element exists in the set
        boolean containsBanana = set.contains("Banana");
        System.out.println("Contains 'Banana'? " + containsBanana);

        // Remove an element from the set
        boolean removedOrange = set.remove("Orange");
        System.out.println("Removed 'Orange'? " + removedOrange);

        // Print the set after removal
        System.out.println("Set after removal: " + set);
    }
}

