package Day.PredefindObject;

public class ObjectClassEx1 {

	public static void main(String[] args) {
		ObjectClassEx1 o=new ObjectClassEx1();
		System.out.println("o:get object in string using explicit form: "+o.toString());
		System.out.println("o:get object in string using implicit form: "+o);
		System.out.println("o:hex address into integer: "+o.hashCode());
		ObjectClassEx1 o1=new ObjectClassEx1();
		System.out.println("o1:get object in string using implicit form: "+o1);
		System.out.println("o1:: "+o1);
		System.out.println("o1:hex address into integer: "+o1.hashCode());
		System.out.println("Comparing o and o1using equals method "+o.equals(o1));
		ObjectClassEx1 o2=o1;
		System.out.println("Comparing o2 and o1 o1using equals method "+o2.equals(o1));
	}
	public int hashCode()
	{
		return 101;
	}
	public String toString()
	{
		return "abc";
		
		
	}
	public boolean equals(Object obj)
	{
		return true;
	}
	void calling()
	{
		System.out.println("I am calling method of ObjectClassEx1 ");
	}

}
