package epam.corejava.collections.compositeObjects;

public class Customer {
	private String customerID;
	private String customerName;
	private String customerCity;
	
	public Customer(String customerID, String customerName, String customerCity) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerCity="
				+ customerCity + "]";
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	
	
	

}
