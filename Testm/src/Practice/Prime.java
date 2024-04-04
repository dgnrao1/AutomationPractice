package Practice;

public class Prime {

	public static void main(String[] args) {
		int n=10,ct=0;
		System.out.println("Num is:"+n);
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				ct++;
			}}	
			if(ct==2)
		{System.out.println("Num is Prime");
		}else {
		System.out.println("Num is  Not Prime");
		}}

}
