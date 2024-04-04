package Day.PredefindClasses;

public class StringClassSplit {

	public static void main(String[] args) {
		String s1="I working s QA Delivery Head";
		System.out.println("Actual String"+s1);
		String[] strAry=s1.split(" ");
		for(String s:strAry)
		{
			System.out.println("s:"+s);
		}
		System.out.println("********************************");
		String s2="I working s QA Delivery Head";
		System.out.println("Actual String"+s2);
		String[] strAry1=s2.split(" ",3);
		for(String s:strAry1)
		{
			System.out.println("s:"+s);
		}
		System.out.println("********************************");
		String s3="I am from UP,I am working in Accenture, I working s QA Delivery Head";
		System.out.println("Actual String"+s3);
		String[] strAry2=s3.split(" ");
		String temp=" ";
		
	for(String s:strAry2)
		{
		System.out.println("s:"+s);
	}
	
for(int i=strAry2.length-1;i>=0;i--)
{
	System.out.println(strAry2.length);
}
	}//for (int i = str1.length() - 1; i >= 0; i--) {
		//System.out.println(str1.charAt(i));

}
