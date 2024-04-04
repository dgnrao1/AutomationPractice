package Day.TypeCasting;

class Starter {
	void idli() {
		System.out.println("Hi I am Idli");
	}
}

class MainCourse extends Starter {
	void biryani() {
		System.out.println("Hi I am Biryani");
	}

}

public class NonPrimitive extends MainCourse {
	void softDrink() {
		System.out.println("Hi I am SoftDrink");
	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		NonPrimitive n = new NonPrimitive();// implicit up casting
		n.softDrink();
		n.biryani();
		n.idli();
		NonPrimitive n1 = (NonPrimitive) new NonPrimitive();// explicit up casting
		n.softDrink();
		n.biryani();
		n.idli();

		System.out.println("*************&&&&&&&&&*********");
		MainCourse m2 = n;// implicit
		m2.biryani();
		m2.idli();
		System.out.println("*************&&&&&&&&&*********");
		MainCourse m3 = (MainCourse) n;// implicit
		m2.biryani();
		m2.idli();

		System.out.println("**********************");
		Starter s = new NonPrimitive();// implicit up casting
		s.idli();
		System.out.println("**********************");
		Starter s1 = (Starter) new NonPrimitive();// explicit up casting
		s.idli();
		System.out.println("*************&&&&&&&&&*********");
		
		MainCourse m = new NonPrimitive();// implicit up casting
        m.biryani();
		m.idli();
		Starter m1=m;
		m1.idli();
		NonPrimitive m4=(NonPrimitive )m;//down casting
		System.out.println("Program Ends");
	}

}
