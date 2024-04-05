package Day12.Practice2IfElse;

public class LargestAmongThreeNums {
	public static void main(String[] args) {
		int n1 = 20, n2 = 10, n3 =13;

		if (n1 >= n2 && n1 >= n3)
			System.out.println(" is the largest number="+n1);

		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " is the largest number.");

		else
			System.out.println(n3 + " is the largest number.");

	}

}
