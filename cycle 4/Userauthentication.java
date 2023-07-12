import java.util.Scanner;
class authException extends Exception
{
public authException(String s) {
super(s);
}
}
public class Userauthentication
{
public static void main(String[] args) {
System.out.println("\nNAME : KISHOR VINOD");
System.out.println("\nREG NO : SJC22MCA-2035");
System.out.println("\nDATE : 23-06-2023");
System.out.println("\nCOURSE CODE : 20MCA132");
System.out.println("\nCOURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
String username = "kishor";
String passcode = "kishor123";
String user_name,password;
Scanner sc = new Scanner(System.in);
try
{
System.out.println("-----------OUTPUT---------");
System.out.println("Enter the username:");
user_name = sc.nextLine();
System.out.println("Enter the password:");
password = sc.nextLine();if(username.equals(user_name) && passcode.equals(password))
{
System.out.println("Authentication successful...");
}
else
throw new authException("Invalid user credentials");
}
catch(authException e)
{
System.out.println("Exception caught "+e);
}
}
}
