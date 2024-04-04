package ConstructorExamples;

public class ConstrctorEx1 {
	ConstrctorEx1() {
		this(12);
		System.out.println("****Iam in zero Parameter");

	}

	ConstrctorEx1(int n) {
		this(23.5);
		System.out.println("****Iam in int Parameter");
		age = n;
	}

	ConstrctorEx1(double m) {
		System.out.println("****Iam in double Parameter");
		sal = m;

	}

	int age;
	double sal;

	public static void main(String[] args) {

		System.out.println("Program Starts");
		ConstrctorEx1 r = new ConstrctorEx1();
		System.out.println("Age is:" + r.age);
		// ConstrctorEx1 r1=new ConstrctorEx1(23);
		// System.out.println("age is"+r1.age);
		// ConstrctorEx1 r2=new ConstrctorEx1(23000.3);
		// System.out.println("Sal is"+r2.sal);
	}

}
