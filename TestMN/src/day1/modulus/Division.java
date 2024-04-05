package day1.modulus;



public class Division {


		
	int num1,num2;
	static int result;
		public static void main(String[] args) {
	Division ref=new Division ();
	ref.num1=25;
	ref.num2=3;
	Division.result=ref.num1/ref.num2;
	System.out.println("Division Result="+Division.result);

	Division ref1=new Division ();
	ref1.num1=25;
	ref1.num2=2;
	result=ref1.num1*ref1.num2;
	System.out.println("result is"+result);
	}

}
