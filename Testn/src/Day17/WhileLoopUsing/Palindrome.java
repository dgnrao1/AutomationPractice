package Day17.WhileLoopUsing;

public class Palindrome {

	public static void main(String[] args) {
		int num=12321,rev=0,rem,t=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			System.out.println("Reversr Num is="+rev);
	}
		if(t==rev)
		{
			System.out.println("Num is Palindrom");
			}else
			System.out.println("Num is Not Palindrom");
				
			}
		}


