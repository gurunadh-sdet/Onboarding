package epam.corejava.collections.compositeObjects;

import java.util.HashMap;

public class MapwithComposite {

	public static void main(String[] args) {
		
		HashMap<String, Customer> customerMap = new HashMap<String, Customer>();
		Customer customer1 = new Customer("123","david","Hyd");
		Customer customer2 = new Customer("456","john","Chn");
		Customer customer3 = new Customer("789","hritik","Mum");
		customerMap.put(customer1.getCustomerID(), customer1);
		customerMap.put(customer2.getCustomerID(), customer2);
		customerMap.put(customer3.getCustomerID(), customer3);		
		
		Order order1 = new Order("123", 2000.0);
		
		Customer customerOrder = customerMap.get(order1.getCustomerID());
		System.out.println(customerOrder);
		System.out.println(order1.getAmount());
		
		
	}
  
}
