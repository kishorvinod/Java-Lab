import java.util.Scanner;
class Fib extends Thread{
int f,n1=0,n2=1,n3;
Fib(int c){
this.f=c;
}
public void run(){
System.out.println("fib is "+n1);
System.out.println("fib is "+n2);
for(int i=2;i<this.f;++i) {
n3=n1+n2;
System.out.println("fib is "+n3);
n1=n2;
n2=n3;
}
}
}
class even extends Thread{
int range;
even(int range){
this.range=range;
}
public void run(){
for(int i=0;i<this.range;i++){
if(i%2==0){
System.out.println("even num is "+i);
}
}
}
}
public class mulThread {
public static void main(String [] args){
int c,range;
Scanner sc=new Scanner(System.in);
System.out.println("\nNAME : KISHOR VINOD ");
System.out.println("\nREG NO : SJC22MCA-2035");
System.out.println("\nDATE : 23-06-2023");
System.out.println("\nCOURSE CODE : 20MCA132");
System.out.println("\nCOURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("-----------OUTPUT---------");
System.out.println("enter the count of Fibonacci");
c=sc.nextInt();
Fib fi=new Fib(c);
System.out.println("enter the range of even number");
range=sc.nextInt();
even ev = new even(range);
fi.start();
ev.start();
}
}
