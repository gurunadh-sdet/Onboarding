package epam.corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(25);
		list.add(65); 
		list.add(15);
		list.add(55);
		System.out.println(list.contains(25));
		list.remove(1);
		System.out.println(list.contains(25));
		list.set(0, 5);
		list.sort(Collections.reverseOrder());
		Object[] ar = list.toArray();
		//ar.toString()
		System.out.println(Arrays.toString(ar));
		list.sort((a,b)->{return (a-b);});
		Object[] ar2 = list.toArray();
		System.out.println(Arrays.toString(ar2));
		
		//ar.toString()		
		List<String> letters = new ArrayList<String>();

		// add example
		letters.add("X");
		letters.add("P");
		letters.add("A");
		Collections.sort(letters);
		
		//convert list to array
		String[] strArray = new String[letters.size()];
		strArray = letters.toArray(strArray);
		System.out.println(Arrays.toString(strArray)); //will print "[A, B, C]"
		
		
		LinkedList<String> linkedList=new LinkedList<String>();//creating linkedlist    
		linkedList.add("guru");//adding object in linkedlist    
		linkedList.add("Raju");    
		linkedList.add("Swati");    
		linkedList.add("Raghu");    
		linkedList.addFirst("Ramu");    
		    
		 System.out.println("linkedlist: "+linkedList);    

	        // Removing elements from the List object
	        // using remove() and removeFirst() method
		 linkedList.remove("Swati");
		 linkedList.removeFirst(); // to use this method we must use Linkedlist reference as Deque is being implemented
	 
	     System.out.println("Linked list after "
	                           + "deletion: " + linkedList);
		
		}

}
