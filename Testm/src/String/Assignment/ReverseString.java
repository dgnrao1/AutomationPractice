package String.Assignment;

public class ReverseString {

	public static void main(String[] args) {
	
String str="Gokul";

for (int i = 0; i < str.length(); i++) {
	System.out.print(str.charAt(i));
}
System.out.println("**********Reverse String***********");
	for (int j = str.length()-1; j>=0; j--) 
		System.out.print(str.charAt(j));
		
	
	StringBuffer sb=new StringBuffer("hello");
	System.out.println("  Actual Word:"+sb);
	System.out.println("Reverse :"+sb.reverse());
}}
