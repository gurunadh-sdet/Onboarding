package epam.corejava.java8.lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEmployees {
//8. Create a TreeSet that sorts the given set of Employees in the alphabetic order of their name
	public static void main(String[] args) {
		
		// we can use Comparator or lambda expression here
		//TreeSet<Employee> employees = new TreeSet<Employee>(Comparator.comparing(Employee::getName));
		TreeSet<Employee> employees = new TreeSet<Employee>((e1,e2)->e1.getName().compareTo(e2.getName()));
		employees.add(new Employee("gurunadh", 123));
		employees.add(new Employee("raja", 456));
		employees.add(new Employee("aarthi", 789));
		employees.add(new Employee("arjun", 231));
		employees.add(new Employee("chandu", 546));
		employees.add(new Employee("mohan", 678));
		employees.add(new Employee("dinku", 99));
		
		System.out.println(employees);
		


	}

}
