package epam.corejava.collections.compositeObjects;

public class Order {
	private String customerID;
	private double amount;
	
	public Order(String customerID, double amount) {
		this.customerID = customerID;
		this.amount = amount;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

	
}
