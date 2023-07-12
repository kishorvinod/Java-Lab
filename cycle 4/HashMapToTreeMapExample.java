import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapToTreeMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 35);

        // Convert HashMap to TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        // Print the HashMap
System.out.println("\nNAME : KISHOR VINOD");
System.out.println("\nREG NO :SJC22MCA-2035");
System.out.println("\nDATE : 26-06-2023");
System.out.println("\nCOURSE CODE : 20MCA132");
System.out.println("\nCOURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("-----------OUTPUT---------");
        System.out.println("HashMap: " + hashMap);

        // Print the TreeMap
        System.out.println("TreeMap: " + treeMap);
    }
}

