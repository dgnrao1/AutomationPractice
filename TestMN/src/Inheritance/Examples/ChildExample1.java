package Inheritance.Examples;

class RBI {
	RBI(int num) {
		System.out.println("Welcome to RBI costructor");
	}

	void homeLoan() {
		System.out.println("Welcome to homeLoan");
	}
}
	class SBI extends RBI {
		SBI(){
			super(23);
			System.out.println("Welcome to SBI costructor");
		}

		void personalLoan() {
			System.out.println("Welcome to personalLoan");

		}
	}

public class ChildExample1 {

	public static void main(String[] args) {
		SBI c=new SBI();
		c.personalLoan();
c.homeLoan();
	}

}
