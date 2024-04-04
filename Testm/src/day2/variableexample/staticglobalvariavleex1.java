package day2.variableexample;

public class staticglobalvariavleex1 {
static int num1,num2;

	public static void main(String[] args) {
		System.out.println("static global variable is"+num1);
		System.out.println("static global variable is"+staticglobalvariavleex1.num2);
		num1=20;
		staticglobalvariavleex1.num2=25;
		System.out.println("static global variable is"+num1);
		System.out.println("static global variable is"+staticglobalvariavleex1.num2);

	}

}
