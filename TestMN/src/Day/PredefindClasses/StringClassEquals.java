package Day.PredefindClasses;

public class StringClassEquals {

	public static void main(String[] args) {

String s1="Mumbai";
String s2="Mumbai";
String s3="Bangalore";
System.out.println("S1:"+s1);
System.out.println("S2:"+s2);
System.out.println("S3:"+s3);
System.out.println("S1 char count:"+s1.length());
System.out.println("S2 char count:"+s2.length());
System.out.println("S3 char count:"+s3.length());
System.out.println("s1&s2 using equals method():"+s1.equals(s2));//compare value bases
System.out.println("s1&s2 using =:"+s1==s2);//compare address bases
System.out.println("s1&s3 using equals method():"+s1.equals(s3));//compare value bases
System.out.println("s1&s3 using =:"+s1==s3);//compare address bases
String s4=new String("Mumbai");//two objects 1.in constant pool 2.in non constant pool
System.out.println("S4:"+s4);
System.out.println("s1&s4 using equals method():"+s1.equals(s4));//compare value bases
System.out.println("s1&s4 using =:"+s1==s4);//compare address bases
String str1="DhanoriPune";
char c=str1.charAt(0);
System.out.println("Char at index o:"+c);
for(int i=0;i<str1.length();i++)
{
	System.out.print(str1.charAt(i));
	
}
System.out.print("********************************");

for(int i=str1.length()-1;i>=0;i--)
{System.out.print(str1.charAt(i));
	
}
System.out.print("********************************");
String temp=" ";
for(int i=str1.length()-1;i>=0;i--)
{temp=temp+str1.charAt(i);
System.out.println(temp);
}
System.out.println("Original String:"+str1);
System.out.println("Reverse temp:"+temp);
//System.out.println(reverseString("DhanoriPune"));
String s="Bangalore";
//System.out.println(reverseString(s));
	}

	

}
//System.out.println("s1&s2 using equals method():"+s1.equals(s2));
//System.out.println("s1&s2 using =:"+s1==s2);