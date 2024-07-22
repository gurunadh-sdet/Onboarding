package epam.corejava.java8.ReferenceOperator;

public class Employee {
	private String name;
	private String account;
	private double salary;
	
	public Employee(String name, String account, double salary) {
		super();
		this.name = name;
		this.account = account;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", account=" + account + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	

}
