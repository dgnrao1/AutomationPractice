package MokePrograms;

public class StringPalindromeOrNot {

	public static void main(String[] args) {
		String str="Gokul";
		String rev="";
		System.out.println("Given String :"+str);
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse String is :"+rev);
		if(str.equals(rev))//if(str==rev)
		{
			System.out.println("Given String is Palindrome");
		}else
			System.out.println("Given String is not Palindrome");
	}

}
