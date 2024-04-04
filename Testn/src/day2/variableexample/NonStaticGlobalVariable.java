package day2.variableexample;

public class NonStaticGlobalVariable {
	int num1,num2;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		NonStaticGlobalVariable Ref=new NonStaticGlobalVariable();
		System.out.println("NonStaticGlobalVariabl num1="+Ref.num1);
		System.out.println("NonStaticGlobalVariable num2="+Ref.num2);
		Ref.num1=20;
		Ref.num2=30;
		System.out.println("NonStaticGlobalVariabl num1="+Ref.num1);
		System.out.println("NonStaticGlobalVariable num2="+Ref.num2);
		System.out.println("NonStaticGlobalVariabl num1="+Ref.num1);
		System.out.println("NonStaticGlobalVariable num2="+Ref.num2);
		
		System.out.println("Program Ends");
	}

}
