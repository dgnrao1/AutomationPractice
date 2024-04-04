package Day.Array;

class Example2 {
	int age;
	double salary;

	Example2() {
		System.out.println("Hi iam Zero Parameter");
	}

	Example2(int a) {
		age = a;
		System.out.println("Hi iam int Parameter");
	}

	Example2(double d) {
		salary = d;
		System.out.println("Hi iam double Parameter");
	}

	void calling() {
		System.out.println("calling of Example class age:" + age);
		System.out.println("calling of Example class salary:" + salary);
	}
}

public class ArrayConstructor {

	public static void main(String[] args) {
		Example2 e = new Example2();
		Example2 e1 = new Example2(12);
		Example2 e2 = new Example2(12.3);
		e.calling();
		e1.calling();
		e2.calling();
		//or
		System.out.println("****************************");
		Example2[] e3 = new Example2[3];
		e3[0]=new  Example2();
		e3[1]=new  Example2(12);
		e3[2]=new  Example2(34.5);
		e3[0].calling();
		e3[1].calling();
		e3[2].calling();

	}

}
