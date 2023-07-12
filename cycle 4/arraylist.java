import java.util.*;
public class arraylist{
public static void main(String[] args) {
ArrayList<String> arrayList= new ArrayList<>();
arrayList.add("Bimal");
arrayList.add("Alan");
arrayList.add("Anandhu");
arrayList.add("Vishnu");
System.out.println("\nNAME : KISHOR VINOD");
System.out.println("\nREG NO :SJC22MCA-2035");
System.out.println("\nDATE : 26-06-2023");
System.out.println("\nCOURSE CODE : 20MCA132");
System.out.println("\nCOURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("-----------OUTPUT---------");
System.out.println("The elements ofthe arraylist is - "+arrayList);
Collections.sort(arrayList);
System.out.println("\nThe ArrayList Sort : "+arrayList); // ArrayList Sort
Collections.addAll(arrayList,"Karun","Vimal","Shan","Ram","Gibin");
System.out.println("\nAdding new items in the arraylist is : "+arrayList); // ArrayList AddAll
Collections.sort(arrayList, Collections.reverseOrder()); //Arraylist in reverse order
System.out.println("\nThe reverse order of the arraylist : "+arrayList);
System.out.println("\nThe maximum element ofthe arraylist : "+Collections.max(arrayList));
//Max elements in the arraylist
}
}
