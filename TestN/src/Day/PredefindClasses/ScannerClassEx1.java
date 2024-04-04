package Day.PredefindClasses;
import java.util.Scanner;
public class ScannerClassEx1 {

	public static void main(String[] args) {
Scanner scrR = new Scanner(System.in);
int age;
double salary;
String name;
boolean valid;
System.out.println("Enter Age value from console");
age= scrR.nextInt();
System.out.println("Enter Salary value from console");
salary= scrR.nextDouble();
System.out.println("Enter Name from console");
name= scrR.next();
System.out.println("Enter True/False from console");
valid=scrR.nextBoolean();
System.out.println("Age:"+age);
System.out.println("Salary:"+salary);
System.out.println("Name:"+name);
System.out.println("Valid:"+valid);



	}

}
