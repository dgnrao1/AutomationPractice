package Day.Array;

public class AverageOfElements {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4};
		double sum=0,average;
		for(int n:numbers)
		{
			sum+=n;
		}
		int l=numbers.length;
		average=sum/l;
		System.out.println("Sum="+sum);
		System.out.println("Length="+l);
		System.out.println("Average="+average);


	}

}
