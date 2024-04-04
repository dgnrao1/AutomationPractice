package day10.SwapVariableExample;

public class SwapExample2 {
int x;int y;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		 SwapExample2 r1=new  SwapExample2();
		 r1.x=25;
		 r1.y=10;
		 System.out.println("Before Swap");
		 System.out.println("X value="+r1.x);
		   System.out.println("Y value="+r1.y);
		 r1.x = r1.x +r1. y; // x now becomes 35
		   r1. y = r1.x -r1. y; // y becomes 25
		   r1. x = r1.x - r1.y; // x becomes 10
		   System.out.println("After Swap");
		   System.out.println("X value="+r1.x);
		   System.out.println("Y value="+r1.y);

System.out.println("Program Ends");
	}

}
