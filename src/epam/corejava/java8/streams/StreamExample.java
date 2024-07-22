package epam.corejava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import epam.corejava.java8.beans.Product;

public class StreamExample {

	public static void main(String[] args) {
		//define the list of products
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Laptop", 1200.0, "Electronics", "A"));
		products.add(new Product("Smartphone", 800.0, "Electronics", "B"));
		products.add(new Product("Watch", 1700.0, "Accessories", "C"));
		products.add(new Product("HeadPhones", 90.0, "Electronics", "Premium"));
		products.add(new Product("Shoes", 600.0, "Clothing", "A"));
		
		
		//1. From the given list of the products get all the products with price > 1000/- 
		
		products.stream().filter(p->p.getPrice()>1000).forEach(s->System.out.println(s.toString()));
		
		
		// 2. From the given list of the products get all the products from electronics category.
		List<Product> electronicproducts = products.stream().filter(p->p.getCategory().equalsIgnoreCase("Electronics")).collect(Collectors.toList());
		System.out.println(electronicproducts);
		
		// 3. From the given list of the products get all the products with price> 1000/- and from electronics category. Change the name of the result list into CAP letters before printing. 
		products.stream()
		.filter(p->p.getPrice()>1000 && p.getCategory().equalsIgnoreCase("Electronics") )
		//.filter(p->p.getCategory().equalsIgnoreCase("Electronics"))
		.map(s->s.getName().toUpperCase())
		.forEach(s->System.out.println(s.toString()));
		
		//4. Calculate the count of all electronic products in the given list of products. 
		long count = products.stream().filter(p->p.getCategory().equalsIgnoreCase("Electronics")).count();
		System.out.println("All the elctronic products count is : "+count);
		
	}

}
