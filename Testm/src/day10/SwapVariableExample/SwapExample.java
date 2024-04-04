package day10.SwapVariableExample;
public class SwapExample {
	int a;
 int b;
static int z;
	public static void main(String[] args) {

		SwapExample r1=new SwapExample();
		System.out.println("Program Starts");
		r1.a=10; 
		r1.b=20;
		System.out.println("Before Swap");
		System.out.println("A value is"+r1.a);
		System.out.println("B value is"+r1.b);
		z=r1.a;
		r1.a=r1.b;
		r1.b=z;
		System.out.println("After Swap");
		System.out.println("A value is"+r1.a);
		System.out.println("B value is"+r1.b);
		
		System.out.println("Program Ends");
		//SwapExample r2=new SwapExample();




	   
	}

}
