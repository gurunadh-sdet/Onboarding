package epam.corejava.java8.lambda;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEmployees10 {
//10. Create a TreeMap that sorts the given set of employees in descending order of their name
	public static void main(String[] args) {
	
	// we can use Comparator or lambda expression here
			//TreeSet<Employee> employees = new TreeSet<Employee>(Comparator.comparing(Employee::getName));
			TreeMap<Employee, Integer> employees = new TreeMap<Employee, Integer>((e1,e2)->e2.getName().compareTo(e1.getName()));
			employees.put(new Employee("gurunadh", 123), 123);
			employees.put(new Employee("raja", 456), 456);
			employees.put(new Employee("aarthi", 789), 789);
			employees.put(new Employee("arjun", 231), 231);
			employees.put(new Employee("chandu", 546), 546);
			employees.put(new Employee("mohan", 678), 678);
			employees.put(new Employee("dinku", 99),99);
			
			// Printing elements in descending order of employee names
	        System.out.println("Elements in descending sorted order by keys:");
	        for (Entry<Employee, Integer> entry : employees.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
		
	}

}
