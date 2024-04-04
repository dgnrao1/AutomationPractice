package Inheritance.Examples;
class Company1
{int age=20;
	void display()
	{
		System.out.println("Iam company class display()....");
	}
}
class Employee extends Company1
{int age=10;
 Employee()
	{
	super.display();
	}
	
	void display()
	{
		System.out.println("Iam Employee class display()....");
	}
	void callme()
	{
		System.out.println("Iam Employee class callme()....");
		System.out.println("age:"+age);
		System.out.println("age"+super.age);
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
		 Employee  ref=new  Employee ();
		ref.display();
		ref.callme();
		//System.out.println("*********");
		// Company1 re=new Employee(); 
		// re.display();
		
	}

}
