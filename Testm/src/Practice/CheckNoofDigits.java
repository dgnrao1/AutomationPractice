package Practice;

public class CheckNoofDigits {

	public static void main(String[] args) {
		int ct=0;
		for(int n=123;n!=0;n=n/10)
		{
			ct++;
		}
		System.out.println("Noof Digits is="+ct);

	}

}
