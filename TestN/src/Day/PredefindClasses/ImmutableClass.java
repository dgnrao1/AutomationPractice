package Day.PredefindClasses;
final class Sample
{
	final String name;
	final int age;
	Sample(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
public class ImmutableClass {

	public static void main(String[] args) {
		Sample s=new Sample("Pune",33);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		//s.name="Mumbai";
		//s.age=21;
		Sample s1=new Sample("Pune",33);
		System.out.println(s.getName());
		System.out.println(s.getAge());
	}

}
