package Day.PredefindClasses;

public class BoxingEx1 {

	public static void main(String[] args) {
		int age=25;
		Integer obj1=age;//boxing implicit
		Integer obj2=25;//boxing implicit
		Integer obj3=(Integer)age;//boxing explicit
		Integer obj4=(Integer)25;//boxing explicit
System.out.println("Age"+age);
System.out.println("obj1"+obj1);
System.out.println("obj2"+obj2);
System.out.println("obj3"+obj3);
System.out.println("obj4"+obj4);
System.out.println("Age==obj1:"+(age==obj1));
int x=obj1.intValue();//un boxing
System.out.println(x);
Character c='A';
char ch=c.charValue();
System.out.println("c:"+c);
System.out.println("ch:"+ch);
	}

}
