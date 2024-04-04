package Practice;

public class ReverseNum {

	public static void main(String[] args) {
		int rev = 0, n = 1234, rem;
		for (; n!= 0; n = n / 10)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
		}
		System.out.println("Reverse Of Number is" + rev);
	}

}
