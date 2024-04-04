package Practice;

public class Palindrome {

	public static void main(String[] args) {

		int rev = 0, n = 12321, rem,t=n;
		for (; n!= 0; n = n / 10)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
		}
		System.out.println("Reverse Of Number is" + rev);

	if(t==rev)
	{
	System.out.println("Num Is Palindrome");	
	}else
	{		System.out.println("Num Is Not Palindrome");

}}
}
