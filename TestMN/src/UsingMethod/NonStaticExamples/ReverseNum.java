package UsingMethod.NonStaticExamples;

public class ReverseNum {

	public static void main(String[] args) {
		int n = 123;
		ReverseNum ref = new ReverseNum();
		System.out.println("Actual Num is:" + n);
		System.out.println("Revese Num is:" + ref.reverseNum(123));

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
}
