package UsingMethod.NonStaticExamples;

public class SimpleIntrest {

	public static void main(String[] args) {
		SimpleIntrest ref=new SimpleIntrest();
		ref.simpleIntrest(2000,2,4);
		System.out.println("*********************");
		ref.simpleIntrest();	

	}
	 void simpleIntrest()
	{
	int p=1000,t=2,r=4,si=0;
	System.out.println("Principal is:"+p);
	System.out.println("Time is:"+t);
	System.out.println("Rate is:"+r);
	si=(p*t*r)/100;
	System.out.println("Simple Intrest is:"+si);
	

} void simpleIntrest(int p,int t,int r)
{
int si=0;
System.out.println("Principal is:"+p);
System.out.println("Time is:"+t);
System.out.println("Rate is:"+r);
si=(p*t*r)/100;
System.out.println("Simple Intrest is:"+si);


	}

}
//Method OverLoading