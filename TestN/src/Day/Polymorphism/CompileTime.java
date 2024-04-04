package Day.Polymorphism;

public class CompileTime {
	static void sum(int a,int b)
	{int c=a+b;
		System.out.println("Addition Of Two Numbers:"+c);
	}
	static void sum(int a,int b,int c)
	{int d=a+b+c;
		System.out.println("Addition Of Three Numbers:"+d);
	}
	public static void main(String[] args) {

		 CompileTime .sum(10,20,30);
		 CompileTime .sum(10,20);

	}

}
