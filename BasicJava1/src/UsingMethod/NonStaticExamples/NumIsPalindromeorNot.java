package UsingMethod.NonStaticExamples;

public class NumIsPalindromeorNot {

	public static void main(String[] args) {
		int n=12321;
		 NumIsPalindromeorNot ref=new  NumIsPalindromeorNot();
		System.out.println("Num is:"+n);
		 System.out.println("Num is Palindrome?"+ref.checkPalindrome(n));
	}

	 boolean checkPalindrome(int num) {
		int rev = 0, rem, t = num;
		boolean result=false;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (t == rev) {
			result= true;
		} else {
			result=false;
		}
		return result;

	}

}
