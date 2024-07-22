package epam.corejava.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingTheList {
	
	//  Use Comparator interface to sort given list of numbers in reverse order

	public static void main(String[] args) {
		
		sortReverseOrder(Arrays.asList(4,8,1,9,34,27,18));
		sortReverseOrderUsingLambda(Arrays.asList(4,8,1,9,34,27,18));
	}
	
	//using Comparator 
	
	public static void sortReverseOrder(List<Integer> list) {
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1>o2?-1:1;
			}
			
		};
		list.sort(com);
		System.out.println(list);
	}
	
	//Using lambda expression with comparator
	public static void sortReverseOrderUsingLambda(List<Integer> list) {
		list.sort((o1,o2)->o2-o1);// using o2-o1 for reverse order we can use same ternary expression o1>o2?-1:1;
		System.out.println(list);
	}

}
