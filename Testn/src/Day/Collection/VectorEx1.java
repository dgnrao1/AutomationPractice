package Day.Collection;
import java.util.Vector;
public class VectorEx1 {

	public static void main(String[] args) {
		// Create a vector
				Vector<String> vec = new Vector<String>();
				System.out.println("Elements are: " + vec.capacity());//10
				// Adding elements using add() method of List
				vec.add("Tiger");
				vec.add("Lion");
				vec.add("Dog");
				vec.add("Elephant");
				vec.add("Cat");
				vec.add("Tiger");
				vec.add("Lion");
				vec.add("Dog");
				vec.add("Elephant");
				vec.add("Cat");
				System.out.println("Vector capacity till 10 elements : " + vec.capacity());
				System.out.println("Elements are: " + vec);		
				vec.addElement("mat");
				System.out.println("Vector capacity after 11th elements : "  + vec.capacity());//20
				System.out.println("Elements are: " + vec);
				for(String str: vec) {
					System.out.println(str);
				}

	}

}
