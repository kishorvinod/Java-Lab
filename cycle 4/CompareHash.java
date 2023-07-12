import java.util.*;
public class CompareHash {
public static void main(String[] args) {
System.out.println("\nNAME : KISHOR VINOD");
System.out.println("\nREG NO :SJC22MCA-2035");
System.out.println("\nDATE : 26-06-2023");
System.out.println("\nCOURSE CODE : 20MCA132");
System.out.println("\nCOURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("-----------OUTPUT---------");
HashSet<String> h_set = new HashSet<String>();
h_set.add("Red");
h_set.add("Green");
h_set.add("Black");
h_set.add("White");
HashSet<String>h_set2 = new HashSet<String>();
h_set2.add("Red");
h_set2.add("Pink");
h_set2.add("Black");
h_set2.add("Orange");
HashSet<String>result_set = new HashSet<String>();
for (String element : h_set){

System.out.println(h_set2.contains(element) ? "Yes" : "No");
}
}
}
