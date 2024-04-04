package Day.CollectionAssignment;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class UniqueElementsToGetInList {

	
		   public static void main(String[] args) {
		      List<String> fruits = new ArrayList<>();
		      fruits.add("Apple");
		      fruits.add("Orange");
		      fruits.add("Banana");
		      fruits.add("Orange");
		      fruits.add("Mango");
		      fruits.add("Apple");

		      List<String> uniqueFruits = fruits.stream()
		         .distinct()
		         .collect(Collectors.toList());

		      System.out.println("Unique fruits: " + uniqueFruits);
		   }

	}


