package Day.PredefindClasses;

public class StringClass {

	public static void main(String[] args) {

String s1="Pune";
System.out.println("S1="+s1);
String s2="Mumbai";
System.out.println("S2="+s2);
String s3="Pune";
System.out.println("S3="+s3);
System.out.println("Compairing two Strings s1 and s2"+s1.equals(s2));
System.out.println("Compairing two Strings s1 and s3"+s1.equals(s3));
System.out.println("Compairing two Strings s1 and s2"+s1==s2);
System.out.println("Compairing two Strings s1 and s3"+s1==s3);
String s4=new String("Bengalore");
System.out.println("S4="+s4);
String s5=new String("Bengalore");
System.out.println("S5="+s5);
System.out.println("Compairing two Strings s4 and s5:"+s4.equals(s5));
System.out.println("Compairing two Strings s4 and s5:"+s4==s5);
String scr="Nag Gokul Lithansh";
System.out.println("Scr is"+scr);
System.out.println("String char count"+scr.length());
System.out.println("char at index 5:"+scr.charAt(5));
System.out.println("***************Print String one by one***************");
for(int i=0;i<scr.length();i++)
{
	System.out.print(" "+scr.charAt(i));
}

System.out.println("*****************************************");
System.out.println("is string empty:"+scr.isEmpty());
System.out.println("Start with Nag:"+scr.startsWith("Nag"));
System.out.println("End with ansh:"+scr.endsWith("ansh"));
System.out.println("is given contains with Lit:"+scr.contains("Lit"));
System.out.println("*****************************************");
System.out.println("Concat value with existing object"+scr.concat("Ratna"));
System.out.println("Original string object"+scr);
System.out.println("Index of L:"+scr.indexOf('L'));
System.out.println("Index of Gokul:"+scr.indexOf("Gokul"));
System.out.println("Index of Last:"+scr.lastIndexOf("i"));
	}
	}


