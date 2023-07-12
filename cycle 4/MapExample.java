import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add elements to the map
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        // Print the initial map
System.out.println("\nNAME : KISHOR VINOD");
System.out.println("\nREG NO :SJC22MCA-2035");
System.out.println("\nDATE : 26-06-2023");
System.out.println("\nCOURSE CODE : 20MCA132");
System.out.println("\nCOURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("-----------OUTPUT---------");
        System.out.println("Initial Map: " + map);

        // Changing an element
        map.put("Alice", 32);

        // Print the map after changing an element
        System.out.println("Map after changing an element: " + map);

        // Removing an element
        map.remove("Bob");

        // Print the map after removing an element
        System.out.println("Map after removing an element: " + map);
    }
}

