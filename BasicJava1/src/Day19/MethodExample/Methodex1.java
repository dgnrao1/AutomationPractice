package Day19.MethodExample;

public class Methodex1 {

	public static void main(String[] args) {
		
		addTwoNumbers();
		System.out.println("****************");
		addTwoNumbers();
		System.out.println("@@@@@@@@@@@@@@@@@@");
		multiplicationOfTwoNumbers(20,2);
	}
	static void multiplicationOfTwoNumbers(int n1,int n2)
	{
		int result=n1*n2;
		System.out.println("Num1:"+n1);
		System.out.println("Num2:"+n2);
		System.out.println("result:"+result);
		
	}
	static void addTwoNumbers()
		{
			int n1=10,n2=20,result;
			result=n1+n2;
			System.out.println("Num1:"+n1);
			System.out.println("Num2:"+n2);
			System.out.println("result:"+result);
			
		}

	}


