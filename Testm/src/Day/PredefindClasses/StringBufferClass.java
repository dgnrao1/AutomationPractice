package Day.PredefindClasses;

public class StringBufferClass {

	public static void main(String[] args) {

StringBuffer sb=new StringBuffer("Hello");
System.out.println("Original StringBuffer:"+sb);
sb.append("java");
System.out.println(" StringBuffer is:"+sb);
sb.insert(5,"Pune");
System.out.println(sb);
sb.replace(1,3, "Nag");
System.out.println(sb);
sb.delete(1,3);
System.out.println(sb);
StringBuffer s1=new StringBuffer("Bangalore is known for IT");
s1.reverse();
System.out.println(s1);
System.out.println("*********************************************");
StringBuffer s2=new StringBuffer();
System.out.println(s2.capacity());//default 16  
s2.append("Hello");  
System.out.println("First Word: "+s2);
System.out.println(s2.capacity());//now 16  
s2.append("java is my favourite language");  
System.out.println("2nd Word: "+s2);
System.out.println(s2.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
s2.append("I am from automation area");  
System.out.println("3rd Word: "+s2);
System.out.println(s2.capacity());//now (34*2)+2=70 i.e (oldcapacity*2)+2
	}

}
