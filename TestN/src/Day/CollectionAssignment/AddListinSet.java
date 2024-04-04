package Day.CollectionAssignment;

import java.util.ArrayList;
import java.util.HashSet;

public class AddListinSet {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		System.out.println("List elements: "+list);

		HashSet<String> set = new HashSet<String>(list);
		System.out.println("Initial set elements: "+set);
		set.add("Gaurav");
		System.out.println("set elements: "+set);

	}

}
