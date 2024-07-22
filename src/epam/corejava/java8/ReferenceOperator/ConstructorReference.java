package epam.corejava.java8.ReferenceOperator;

public class ConstructorReference {
	// 1. Write a program get the details of Employee Object , such as name,account,salary ,
			//where Employee class has parameterized constructor using constructor reference
	public static void main(String[] args) {
		
		//First we will create using lambda expression
		
		EmployeeObjService employeeObjService = ( name,  account, salary)-> {
				return new Employee(name,account, salary);
			};
			
		Employee obj1 =employeeObjService.get("Gurunadh", "EPAM", 20000);
		System.out.println(obj1.toString());
			
			
		 // Using constructor reference to create Employee objects
		EmployeeObjService objfactory = Employee::new;
		
		Employee obj2 =objfactory.get("Raja", "ServiceNow", 30000);
		System.out.println(obj2.toString());
		
		
		
		
	}

}
