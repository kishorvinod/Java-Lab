import package_graphics.*;
import java.util.*;
public class main_graphics {
    public static void main(String []args){
        package_graphics testObj = new package_graphics();
        int l,h,r,a,c,d;
        Scanner s=new Scanner(System.in);
System.out.println("\nNAME : KISHOR VINOD ");
System.out.println("\nREG NO :SJC22MCA-2035");
System.out.println("\nDATE : 23-06-2023");
System.out.println("\nCOURSE CODE : 20MCA132");
System.out.println("\nCOURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("-----------OUTPUT---------");
        System.out.println("Enter the length for rectangle");
        l=s.nextInt();
        System.out.println("Enter the breadth for rectangle");
        h=s.nextInt();
        System.out.println("Enter the radius of circle");
        r=s.nextInt();
        System.out.println("Enter the side for Square");
        a=s.nextInt();
        System.out.println("Enter the breadth for triangle");
        c=s.nextInt();
        System.out.println("Enter the height for triangle");
        d=s.nextInt();
        System.out.println("\narea of rectangle:"+testObj.recArea(l,h));
        System.out.println("\narea of circle:"+testObj.cirArea(r));
        System.out.println("\narea of square:"+testObj.squArea(a));
        System.out.println("\narea of triangle:"+testObj.triArea(c,d));
   }
}
