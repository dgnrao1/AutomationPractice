package Inheritance.Examples;

class A {
	A() {
		System.out.println("HI Iam class A Constructor");
	}

	int reverseNum()

	{
		int rev = 0, rem, num = 123;
		while (num != 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		return rev;
	}
}

class B extends A {
	B() {
		super();
		System.out.println("HI Iam class B Constructor");
	}

	int reverseNum()

	{
		int rev = 0, rem,num=345;
		while (num != 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		return rev;
	}
}

public class SingleInheritance {

	public static void main(String[] args) {

		System.out.println("Program Starts");
		A b = new B();
		System.out.println("Reverse Number is:" + b.reverseNum());

	}
}
