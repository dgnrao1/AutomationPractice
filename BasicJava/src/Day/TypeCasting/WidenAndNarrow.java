package Day.TypeCasting;

public class WidenAndNarrow {
	double test1(double num)//widening
	{
		System.out.println("Running test1");
		return 4;//widening
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		 WidenAndNarrow w=new  WidenAndNarrow();
		 System.out.println("Return Value"+w.test1(34));
		 int r=(int)w.test1(45.6);//narrowing-explicit
		 System.out.println("Return Value"+r);
		 System.out.println("Program Ends");

	}

}
