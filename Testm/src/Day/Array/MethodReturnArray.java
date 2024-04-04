package Day.Array;

class ReturnArray
{
	static int[] getArray()
	
	{
		/*int n[]=new int[3];
		n[0]=10;
		n[1]=21;
		n[2]=31;
		return n;*/
		return new int[]{10,21,31};
		
				
	}
}
public class MethodReturnArray {

	public static void main(String[] args) {

int arr[]=ReturnArray.getArray();
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
	}

}
