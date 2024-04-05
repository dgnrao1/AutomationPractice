package Day19.MethodExample;

public class ReverseNum {

	public static void main(String[] args) {
		int n=123;
		System.out.println("Actual Num is:"+n);
		System.out.println("Revese Num is:"+reverseNum(123));
		
	}
static int reverseNum(int num)
{
	int rev=0,rem;
	while(num!=0)
	{
	 
		 rem = num % 10;
		rev = rev * 10 + rem;
		num=num/10;
		
	}
return rev;
}
}


