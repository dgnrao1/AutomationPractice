package Day19.MethodExample;

public class Palindrome {

	public static void main(String[] args) {
		palindromeNum();
	}

	static void palindromeNum()

	{

		int num=1232 , t, s = 0, rem;

		t = num;
		for (; num > 0; num /= 10) {
			rem = num % 10;
			s = (s * 10) + rem;
		}
		
		if (s == t) {
			System.out.println(t + " is a palindrome number ");
		} else
			System.out.println(t + " is not a palindrome number ");

	}
}
