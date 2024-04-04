package Day.Collection;
import java.util.Vector;
public class VectorEx2 {

	public static void main(String[] args) {
		// Create a vector
				Vector<String> vec = new Vector<String>();//default capacity is 10, its capacity gets increase by 100% of its size
				// Adding elements using add() method of List
				vec.add("Tiger");//return type is boolean
				vec.add("Lion");
				vec.add("Dog");
				vec.add("Elephant");
				// Adding elements using addElement() method of Vector
				vec.addElement("Rat");//return type is void
				vec.addElement("Cat");
				vec.addElement("Deer");
				System.out.println("Elements are: " + vec);
				for(String str: vec) {
					System.out.println(str);
				}
			}
		
		/**add and addElement :both are same but add return type is boolean and addElement return type is void
		  (both are using for adding elements)
		Synchronized --> Thread Safe ----> slow
		default capacity-->10 --> increases capacity by 100%
		Vector comes from JDK 1.0 ---> also known as legacy class
		*/

	}


