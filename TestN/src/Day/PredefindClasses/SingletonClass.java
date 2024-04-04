package Day.PredefindClasses;

class Sample1{
private Sample1()
{
System.out.println("*********Private Constructor of Sample class**********");	
}
private static Sample1 s=new Sample1();
public static Sample1 getInstanceOfSampleClass()
{
	return s;
}
int age=46;
void calling()
{
	System.out.println("I am calling method");
}}
public class SingletonClass {

	public static void main(String[] args) {
		
//Sample s1=new Sample();
Sample1 s1=Sample1.getInstanceOfSampleClass();
System.out.println(s1.age);
s1.calling();

	}

}
