package Day19.MethodExample;

public class CheckEven {

	public static void main(String[] args) {
		//int n1=6;
		//System.out.println("Num is="+n1);
		System.out.println("Num is Even?"+checkEven(6));
		System.out.println("Num is Even?"+checkEven(7));
	}
	static boolean checkEven(int num)
	{
		boolean result=false;
		if(num%2==0)
		{
			result=true;
			
		}else {result=false;
		}
		return result;
		}
	}

