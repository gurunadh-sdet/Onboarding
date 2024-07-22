package epam.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		//Hash Set Examples
		
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");

		Set<String> set2 = new HashSet<String>();
		set2.add("three");
		set.removeAll(set2);		
		set2.add("four");

		set.retainAll(set2);
		
		//LInkedHashSet examples
		LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("one");
		linkedSet.add("two");
		linkedSet.add("three");
		System.out.println(linkedSet);
		System.out.println(linkedSet.contains("one"));
		
		//TreeSet maintains sorting order
        
		SortedSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(27);
		treeSet.add(25);
		treeSet.add(13);
		treeSet.add(65);
		treeSet.add(8);
		Iterator it =  treeSet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
