package Day19.MethodExample;

public class CharactorsAtoM {

	public static void main(String[] args) {
		PrintChar('A', 'Z');
		System.out.println("*************************");
		PrintChar('A', 'M');
		System.out.println( "*&&&&&&&&&&&&&&&");
		PrintChar('c', 'l');
	}

	static void PrintChar(char starts, char ends) {
		for (; starts <= ends; starts++) {
			System.out.print(starts + "");
		}
		//System.out.println();
	}
}
