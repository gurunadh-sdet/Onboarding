package epam.corejava.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingCollections {
// 11. Use Collections.Sort to sort the given list of Employees in descending order of their name
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("gurunadh", 123));
		employees.add(new Employee("raja", 456));
		employees.add(new Employee("aarthi", 789));
		employees.add(new Employee("arjun", 231));
		employees.add(new Employee("chandu", 546));
		employees.add(new Employee("mohan", 678));
		employees.add(new Employee("dinku", 99));
		sortReverseUsingComparator(employees);
		sortReverseUsingLambda(employees);	
	}
	
	public static void sortReverseUsingComparator(List<Employee> list) {
		Comparator<Employee> com = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e2.getName().compareTo(e1.getName());
			}		
		};	
		Collections.sort(list, com);
		System.out.println(list);	
	}
	
	//replace comparator with simple lambda expression
	public static void sortReverseUsingLambda(List<Employee> list) {
		Collections.sort(list,
				(e1,e2)->e2.getName().compareTo(e1.getName()) );
		System.out.println(list);
	}
	

}
