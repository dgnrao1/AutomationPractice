package ConstructorExamples;

public class ConstructorOverLoading {
	ConstructorOverLoading() {
		this(23);
		System.out.println("Hi iam zero Parameter ");
	}


	ConstructorOverLoading (int num)
	{
		System.out.println("Hi iam int Parameter ");
		age=num;
	}
		int age;
		public static void main(String[] args) {
	System.out.println("Program Starts");
	 ConstructorOverLoading r=new  ConstructorOverLoading ();
	 System.out.println("r Age is "+r.age);
	 //ConstructorOverLoading ref=new  ConstructorOverLoading (23);
	//System.out.println("Age"+ref.age);
	System.out.println("Program Starts");
		}

	}


