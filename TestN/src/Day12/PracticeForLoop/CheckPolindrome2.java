package Day12.PracticeForLoop;

//import java.util.Scanner;

public class CheckPolindrome2 {

	public static void main(String[] args) {

		int num = 123, t, s, rem;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter any number ");
		// num = sc.nextInt();
		t = num;
		for (s = 0; num > 0; num /= 10) {
			rem = num % 10;
			s = (s * 10) + rem;
			System.out.println("s=" + s);
			System.out.println("rem=" + rem);
		}
		if (s == t) {
			System.out.println("s=" + s);
			System.out.println("t=" + t);
			System.out.println(t + " is a palindrome number ");
		} else
			System.out.println(t + " is not a palindrome number ");

	}

}
