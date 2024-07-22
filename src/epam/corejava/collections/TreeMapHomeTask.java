package epam.corejava.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapHomeTask {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of test cases: ");
		Scanner scan = new Scanner(System.in);
		int n =Integer.parseInt(scan.nextLine());
		StringBuilder result = new StringBuilder();
		for(int i=0;i<n;i++) {
			String queries = scan.nextLine().trim();
			int queryCount = Integer.parseInt(queries);
			// to change the default sorting to descending order
			TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>((n1,n2)->(n1>n2?-1:1));
			//TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
			
			for(int q=0;q<queryCount;q++) {
				String Q =scan.nextLine().trim();
				String[] query= Q.split(" ");
				 char operation = query[0].charAt(0);
	                
	                switch (operation) {
	                    case 'a':
	                        // Add an entry with key x and value y to the TreeMap
	                        int x = Integer.parseInt(query[1]);
	                        int y = Integer.parseInt(query[2]);
	                        treeMap.put(x, y);
	                        break;
	                    case 'b':
	                        // Print value of x if present in the TreeMap, else print -1
	                        int keyB = Integer.parseInt(query[1]);
	                        result.append(treeMap.getOrDefault(keyB, -1)).append(" ");
	                        break;
	                    case 'c':
	                        // Print size of the TreeMap
	                        result.append(treeMap.size()).append(" ");
	                        break;
	                    case 'd':
	                        // Remove an entry with key x from the TreeMap
	                        int keyD = Integer.parseInt(query[1]);
	                        treeMap.remove(keyD);
	                        break;
	                    case 'e':
	                        // Print TreeMap sorted by keys
	                    	//As treeMap already sorted in default sorting =Ascending order
	                    	//we can use comparator or lambda expression to change t
	                    	//the default sorting order to descending order as in Line number:19
	                        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
	                            result.append(entry.getKey()).append(" ").append(entry.getValue()).append(" ");
	                        }
	                        break;
	                    default:
	                    	 // Throw exception for unknown operation
	                        throw new IllegalArgumentException("Unknown operation type mentioned: " + operation);
	                }              
				
			}
			 result.append("\n");
			
		}
		 System.out.print(result.toString());
	        scan.close();
	}

}

/*
 * 6
a 1 2 a 66 3 b 66 d 1 c e
4
a 1 66 b 5 e c */
