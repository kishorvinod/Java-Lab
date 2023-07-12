import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
        Queue<Integer> queue = new PriorityQueue<>();

        // Add elements to the queue
        queue.offer(5);
        queue.offer(2);
        queue.offer(8);
        queue.offer(1);

        // Print the queue
System.out.println("\nNAME : KISHOR VINOD");
System.out.println("\nREG NO :SJC22MCA-2035");
System.out.println("\nDATE : 26-06-2023");
System.out.println("\nCOURSE CODE : 20MCA132");
System.out.println("\nCOURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("-----------OUTPUT---------");
        System.out.println("Queue elements: " + queue);

        // Retrieve and remove elements from the queue
        while (!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println("Removed element: " + element);
        }
    }
}

