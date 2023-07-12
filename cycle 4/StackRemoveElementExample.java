import java.util.Stack;

public class StackRemoveElementExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<String> stack = new Stack<>();

        // Add elements to the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");
        stack.push("Mango");

        // Print the stack
System.out.println("\nNAME : KISHOR VINOD");
System.out.println("\nREG NO :SJC22MCA-2035");
System.out.println("\nDATE : 26-06-2023");
System.out.println("\nCOURSE CODE : 20MCA132");
System.out.println("\nCOURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("-----------OUTPUT---------");
        System.out.println("Stack elements: " + stack);

        // Remove an element from the stack by position
        int positionToRemove = 2; // Position starts from 1
        removeElement(stack, positionToRemove);

        // Print the stack after removal

        System.out.println("Stack after removal: " + stack);
    }

    public static void removeElement(Stack<String> stack, int position) {
        if (stack.isEmpty() || position <= 0 || position > stack.size()) {
            System.out.println("Invalid position or stack is empty.");
            return;
        }

        // Create a temporary stack to hold removed elements
        Stack<String> tempStack = new Stack<>();

        // Remove elements until the desired position
        for (int i = 1; i < position; i++) {
            tempStack.push(stack.pop());
        }

        // Remove the element at the desired position
        stack.pop();

        // Restore the remaining elements back to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}

