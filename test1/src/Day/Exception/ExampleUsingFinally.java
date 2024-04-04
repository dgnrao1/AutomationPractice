package Day.Exception;

public class ExampleUsingFinally {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		try
		{
			//below code do not throw any exception
			int data=25/0;
			System.out.println(data);
		}
//catch wont be executed
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Handeled");
		}
		//executed regardless ofexception occured or not
		finally {
			System.out.println("Finally block is always executed");
		}
		System.out.println("Rest of the code");
	}

}
