package Day.CollectionAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

public class AddListInQueue {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();// Generic
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		System.out.println("An initial list of elements: " + al);
		Queue<String> queue = new PriorityQueue<String>(al);

		System.out.println("Initial Queue elements: " + queue);
		queue.add("Gaurav");
		System.out.println("set elements: " + queue);
		
	}

}
