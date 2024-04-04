package Day19.MethodExample;

public class SimpleIntrest {
int p=1234;
	public static void main(String[] args) {
		SimpleIntrest r=new SimpleIntrest ();
		r.simpleIntrest(2000,2,4);
		System.out.println("*********************");
		r.simpleIntrest();	

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
System.out.println("*********************");
System.out.println("LV :"+p);
System.out.println("NSGV:"+this.p);//This keyward

	}}
