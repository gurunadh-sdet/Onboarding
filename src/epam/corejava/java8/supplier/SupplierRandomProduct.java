package epam.corejava.java8.supplier;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import epam.corejava.java8.beans.Product;

public class SupplierRandomProduct {

	//1. Write a supplier to produce a random product. 

	public static void main(String[] args) {
		 List<Product> products = List.of(
	                new Product("Laptop", 4500.0, "Electronics","Regular"),
	                new Product("Smartphone", 1800.0,"Electronics", "Regular"),
	                new Product("Headphones", 200.0,"Electronics", "Regular"),
	                new Product("Camera", 3100.0,"Electronics", "Regular")
	        );
		 
		 final Random random = new Random();
		 
		 Supplier<Product> productSupplier = new Supplier<Product>() {

			@Override
			public Product get() {
				 int index = random.nextInt(products.size());
				return products.get(index);
			}					 
		 };
		 
		 Product randomProduct1 = productSupplier.get();
		 System.out.println(randomProduct1.toString());
		 
		 Product randomProduct2 = productSupplier.get();
		 System.out.println(randomProduct2.toString());
		
		
	}

}
