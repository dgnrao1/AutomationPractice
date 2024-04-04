package Inheritance.Examples;
class Parent
{
	int age=33;
	static double salary=20000.32;
}

public class Child extends Parent
{
	int empID=1001;
	static int pinCode=523230;


	public static void main(String[] args) {
		 Child r=new  Child ();
		 System.out.println("Age in parent class NSGV="+r.age);
		 System.out.println("empID in child class NSGV="+r.empID);
		 System.out.println("salary in parent class NSGV="+Parent.salary);
		 System.out.println("empID in child class NSGV="+Child.pinCode);
	}

}
