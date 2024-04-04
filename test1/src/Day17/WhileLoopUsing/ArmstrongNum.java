package Day17.WhileLoopUsing;

public class ArmstrongNum {

	public static void main(String[] args) {
		int arm=0,temp,n=153,a;
		temp=n;
		while(n!=0)
		{
			a=n%10;
			arm=arm+(a*a*a);
			n=n/10;
		}
		if(arm==temp)
		System.out.println(temp+" is a armstrong number ");
		else
		System.out.println(temp+" is not a armstrong number ");
	}
		

	}


