package Day.Exception;

public class Example2 {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		//catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("ArrayIndexOutOfBoundsException occurs:"+e);
		catch (ArithmeticException e) {
			System.out.println("ArithematicException occurs:"+e);
		}//catch (Exception e) {
			//System.out.println("ParentException occurs:"+e);

	}

}
