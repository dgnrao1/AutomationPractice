package Day.Exception;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//1.Abnormal statements
		int i=12,j=0,k;
	/*	Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number1:");
		i=s.nextInt();
		System.out.println("Enter First Number2:");
		j=s.nextInt();*/
		try {
		k=i/j;//Arithmetic Exception
		System.out.println("result"+k);
		}catch(ArithmeticException e) {
			System.out.println("Exception Name:"+e.getMessage());//by zero
			System.out.println("Exception Name:"+e.getCause());// null (Exception in thread "main" java.lang.ArithematicException)
	e.printStackTrace();//CompleteException in red color
			//System.out.println("Exception Class"+e);
		}
		System.out.println("Program Ends");
		

	}

}
