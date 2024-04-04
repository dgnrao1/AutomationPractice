package Day.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListEx1 {

	public static void main(String[] args) {
		//ArrayList list=new ArrayList();
List list=new ArrayList();
System.out.println("Is List Empty: "+list.isEmpty());
list.add("Nag");//String Object----object class object(auto up casting)
list.add(123);//int----Integer object(Auto Boxing)----object class object
list.add(true);//boolean---Boolean object(Auto Boxing)----object class object
list.add(null);
list.add("Nag");
System.out.println("List elements are"+list);
System.out.println(" elements in list:"+list.size());
list.add(1,"Selenium");
System.out.println("List elements are"+list);
System.out.println(" elements in list:"+list.size());
System.out.println("Element at index 1:"+list.get(0));
System.out.println("Is List Empty: "+list.isEmpty());
System.out.println("*************List elements using For Loop**************");
	for(int i=0;i<list.size();i++)	
	{
		System.out.println("Element at index:" +i+": "  +list.get(i));
	}
	System.out.println("*************List elements using For each Loop**************");
	for(Object obj:list) {
		System.out.println(obj);
	}
	
	System.out.println("List Elements of L1");
	
	
	List l1=new ArrayList();
	l1.add("Nag");
	l1.add("Gokul");
	l1.add("Lithansh");
	System.out.println("List Elements of L1"+l1);
System.out.println("List Elements of L1");
	
	
	List l2=new ArrayList();
	l2.add("Apple");
	l2.add("Orange");
	l2.add("Banana");
	System.out.println("List Elements of L2"+l2);
	l1.addAll(l2);
	System.out.println("After adding L2 in L1,List Elements:"+l1);
	l1.removeAll(l2);
	System.out.println("After adding L2 in L1,List Elements:"+l1);
	System.out.println("Index of Nag:"+list.indexOf("Nag"));
	System.out.println("Index of Nag:"+list.lastIndexOf("Nag"));
	list.set(4, "Ratna");
	System.out.println("List elements are:"+list);
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}}
	


