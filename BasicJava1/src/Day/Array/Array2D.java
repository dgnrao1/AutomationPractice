package Day.Array;

public class Array2D {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		System.out.println("total row in array:" + arr.length);// row count
		System.out.println("colmun in row0:" + arr[0].length);// row0 cell count
		for (int i = 0; i < arr.length; i++)// row count
		{
			for (int j = 0; j < arr[i].length; j++)// cell count on current row
			{
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
		System.out.println("******************************");
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		for (int i = 0; i < arr.length; i++)// row count
		{
			for (int j = 0; j < arr[i].length; j++)// cell count on current row
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
