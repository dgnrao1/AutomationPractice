package Day17.WhileLoopUsing;

public class Prime {

	public static void main(String[] args) {
		int num = 10, ct = 0, i = 1;
		System.out.println("print num="+num);
		while (i <= num) {
			if (num % i == 0) {
				ct++;
			}
			i++;
		}

		if (ct == 2)
			System.out.println("Num is Prime");
		else
			System.out.println("Num is not Prime");
	}
}
