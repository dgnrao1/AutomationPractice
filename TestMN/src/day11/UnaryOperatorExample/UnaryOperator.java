package day11.UnaryOperatorExample;

public class UnaryOperator {

	public static void main(String[] args) {

int a=0,b;
b=a++ + ++a + ++a +a;
System.out.println("a value ="+a);
System.out.println("b value ="+b);
a=0;
b=a-- + --a + --a +a;
System.out.println("a value ="+a);
System.out.println("b value ="+b);
a=0;
b=--a + --a + --a + a + ++a + a++;
System.out.println("a value ="+a);
System.out.println("b value ="+b);
a=0;
b=a-- + a + ++a + a++ + ++a + a++ + a;
System.out.println("a value ="+a);
System.out.println("b value ="+b);


	}

}
