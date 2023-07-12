import java.util.*;
class deque
{
public static void main(String[] args)
{
Deque<String> deque = new LinkedList<String>();
deque.add("Java");
deque.addFirst("Python");
deque.addLast("Datastructure");
deque.push("Web-programming");
deque.offer("Networking");
deque.offerFirst("DBMS");
System.out.println("\nNAME : KISHOR VINOD");
System.out.println("\nREG NO :SJC22MCA-2035");
System.out.println("\nDATE : 26-06-2023");
System.out.println("\nCOURSE CODE : 20MCA132");
System.out.println("\nCOURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("-----------OUTPUT---------");
System.out.println(deque + "\n");
deque.removeFirst();
deque.removeLast();
System.out.println("Deque after removing " + "first and last: " + deque);
}
}
