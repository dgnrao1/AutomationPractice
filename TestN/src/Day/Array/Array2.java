package Day.Array;

public class Array2 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9, 4 } };
		System.out.println("total row in array:" + arr.length);// row count
		System.out.println("colmun in row0:" + arr[0].length);// row0 cell count
		for (int i = 0; i < arr.length; i++)// row count
		{
			for (int j = 0; j < arr[i].length; j++)// cell count on current row
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
		char[][] carr = { { 'a','b' }, { 'c','d','e' }, { 'f','g','h','i'} };
		System.out.println("total row in array:" + carr.length);// row count
		System.out.println("colmun in row0:" + carr[0].length);// row0 cell count
		for (int i = 0; i < carr.length; i++)// row count
		{
			for (int j = 0; j < carr[i].length; j++)// cell count on current row
			{
				System.out.print(carr[i][j] + " ");
			}
			System.out.println();


	}
	}
}
