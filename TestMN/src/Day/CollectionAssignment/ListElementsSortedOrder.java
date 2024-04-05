package Day.CollectionAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class ListElementsSortedOrder {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();// Creating arraylist
		list.add("Mango");// auto-upcasting from String to Object class object
		list.add("Apple");
		list.add("Banana");
		list.add("123");
		// Printing the arraylist object
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
		Collections.sort(list);//by default it sort the passed collection element in assending order and store it in the same collection
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
	}

}
