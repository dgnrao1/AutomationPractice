package ConstructorExamples;

public class Constroctor {
	
	Constroctor(int num)
	{
		System.out.println("Hi Iam  int Parameters ");
		age=num;
	}
	int age;
	public static void main(String[] args) {
		
System.out.println("Program Starts");
Constroctor ref=new Constroctor(23);
System.out.println("Age"+ref.age);
System.out.println("Program Starts");
	}

}
