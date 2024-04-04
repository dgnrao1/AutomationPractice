package Inheritance.Examples;

class Parent1 {
	Parent1() {
		System.out.println("Parent1s Class");
	}int a=90;

	boolean checkPalindrome() {
		int rev = 0, rem, num = 2345, t = num;
		boolean result = false;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (t == rev) {
			result = true;
		} else {
			result = false;
		}
		return result;

	}
}

class Child1 extends Parent1 {
	int a=20;
	Child1() {
		super.checkPalindrome();
		System.out.println("Child1s Class");
		System.out.println("Parent Class Variable is:"+super.a);
		System.out.println("Child1s Class variable is"+a);
	}

	boolean checkPalindrome(int num) {
		int rev = 0, rem, t = num;
		boolean result = false;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (t == rev) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	int reverseNum(int num) {
		int rev = 0, rem;
		while (num != 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		return rev;
	}

	 boolean checkPrime(int num) {
			boolean result = false;
			int ct = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					ct++;
					if (ct == 2) {
						result = true;
					} else
						result = false;
				}

			}
			return result;
	 }
	boolean checkEven(int num) {
		boolean result = false;
		if (num % 2 == 0) {
			result = true;

		} else {
			result = false;
		}
		return result;
	}
	 boolean armstrong(int n) {
			boolean result = false;
			int arm = 0, temp, a;
			temp = n;
			while (n != 0) {
				a = n % 10;
				arm = arm + (a * a * a);
				n = n / 10;
			}
			if (arm == temp) {
				result = true;

			} else {
				result = false;
			}
			return result;

		}
	 int checkDigits(int n)
		{
			int ct=0;
			for(;n!=0;n=n/10)
			{
				ct++;
			}
			return ct;
}
}
public class Overriding {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Child1 c = new Child1();
		System.out.println("Num is Palindrome?" + c.checkPalindrome(12321));
		System.out.println("Num is Reverse:" + c.reverseNum(123));
		 System.out.println("Num is Prime ?"+c.checkPrime(5));
		System.out.println("Num is CheckEven?" + c.checkEven(123));
		System.out.println("Num is Armstrong?" + c.armstrong(153));
		System.out.println("Check no of Digits?" + c.checkDigits(123));
	}

}
