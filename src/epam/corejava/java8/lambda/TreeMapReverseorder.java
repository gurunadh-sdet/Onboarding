package epam.corejava.java8.lambda;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//9. Create a TreeMap that sorts the given set of values in decending order

public class TreeMapReverseorder {

	public static void main(String[] args) {
		// we can use Comparator or lambda expression here
       // TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
		 TreeMap<Integer, String> treeMap = new TreeMap<>((o1,o2)->o2-o1);
        
        // Adding elements to the TreeMap
        treeMap.put(1, "One");
        treeMap.put(5, "Five");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");

        // Printing elements in descending sorted order by keys
        System.out.println("Elements in descending sorted order by keys:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

}
