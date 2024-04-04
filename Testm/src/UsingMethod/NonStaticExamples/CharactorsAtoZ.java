package UsingMethod.NonStaticExamples;

public class CharactorsAtoZ {

	public static void main(String[] args) {
		 CharactorsAtoZ  ref=new  CharactorsAtoZ ();
		ref.PrintChar('A', 'Z');
		System.out.println("*************************");
		ref.PrintChar('A', 'M');
		System.out.println( "*&&&&&&&&&&&&&&&");
		ref.PrintChar('c', 'l');
	}

	 void PrintChar(char starts, char ends) {
		for (; starts <= ends; starts++) {
			System.out.print(starts + "");
		}
		System.out.println();

	}

}
