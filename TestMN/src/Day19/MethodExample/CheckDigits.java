package Day19.MethodExample;

public class CheckDigits {

	public static void main(String[] args) {
		
	
		System.out.println("Check No of Digits ?"+checkDigits(1234));
	
	}
	static int checkDigits(int n)
	{
		int ct=0;
		for(;n!=0;n=n/10)
		{
			ct++;
		}
		return ct;
	}

}
