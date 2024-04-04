package Inheritance.Examples;
class D
{
	int i=32;

}
class E extends D
{
	float f=23.5f;
}
class C extends E
{
	double d=56.1;
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		C c=new C();
System.out.println("Program Starts");
System.out.println("i="+c.i);
System.out.println("f="+c.f);
System.out.println("d="+c.d);
	}

}
