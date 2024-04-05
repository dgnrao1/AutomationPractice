package String.Assignment;

public class FindPalindromeOrNot {

	public static void main(String[] args) {
		String s1 = "HellolleH";
		System.out.println("Actual String is..." +s1);
		String temp = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			temp = temp + s1.charAt(i);
		}
		if (temp.equals(s1)) {
			System.out.println("Given string is a palindrome..." +s1);
		} else {
			System.out.println("Given string is not a palindrome..." + s1);
		}
	}

}
