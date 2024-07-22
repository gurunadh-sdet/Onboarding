package epam.corejava.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeComparator {
// 6. Use Comparator interface to sort given list of Employees in the alphabetic order of their name
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("gurunadh", 123));
		employees.add(new Employee("raja", 456));
		employees.add(new Employee("aarthi", 789));
		employees.add(new Employee("arjun", 231));
		employees.add(new Employee("chandu", 546));
		employees.add(new Employee("mohan", 678));
		employees.add(new Employee("dinku", 99));
		sortAlphabeticalUsingComparator(employees);
		sortAlphabeticalUsingLambda(employees);	
	}
	public static void sortAlphabeticalUsingComparator(List<Employee> list) {
		Comparator<Employee> com = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}		
		};	
		list.sort(com);
		System.out.println(list);	
	}
	
	//replace comparator with simple lambda expression
	public static void sortAlphabeticalUsingLambda(List<Employee> list) {
		list.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println(list);
		
	}
	

}
