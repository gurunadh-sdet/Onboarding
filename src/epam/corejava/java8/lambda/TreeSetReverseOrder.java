package epam.corejava.java8.lambda;

import java.util.Comparator;
import java.util.TreeSet;
//7.  Create a TreeSet that sorts the given set of numbers in reverse order
public class TreeSetReverseOrder {

	public static void main(String[] args) {
		// we can use Comparator or lambda expression here
		//TreeSet<Integer> set = new TreeSet<Integer>( Comparator.reverseOrder());
		TreeSet<Integer> set = new TreeSet<Integer>((o1,o2)->o2-o1);
		set.add(56);
		set.add(67);
		set.add(34);
		set.add(45);
		set.add(26);
		set.add(18);
		System.out.println(set);
		
	}

}
