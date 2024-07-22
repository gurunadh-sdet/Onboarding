package epam.corejava.java8.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import epam.corejava.java8.beans.Product;

public class ProductExamples {
	

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Laptop", 1200.0, "Electronics", "A"));
		products.add(new Product("Smartphone", 800.0, "Electronics", "B"));
		products.add(new Product("Watch", 1700.0, "Accessories", "C"));
		products.add(new Product("HeadPhones", 90.0, "Electronics", "Premium"));
		products.add(new Product("Shoes", 600.0, "Clothing", "A"));
		
		// Here we can write a seperate methods as well to return the predicate, but for simplicity I choose in main method
		
		//1. Define a predicate to check if the price of given product is greaterthan 1000/-. 
		Predicate<Product> priceGreaterThan1000 = new Predicate<Product>() {

			@Override
			public boolean test(Product t) {
				return t.getPrice()>1000.0; 
			}
			
		};
		
		//Print all the products from the given list of the products if the price is greaterthan 1000/-.
		
		for(Product p:products) {
			if (priceGreaterThan1000.test(p))
				System.out.println(p.toString());
		}
		
		//2. Define a predicate to check if the product is of electronics category. 
		System.out.println("#########################################################");
		Predicate<Product> isElectronicsCategory = new Predicate<Product>() {
			@Override
			public boolean test(Product t) {
				return t.getCategory().equalsIgnoreCase("Electronics");		
			}	
		};
		
		//Print all the products from the given list of the products if the product is of electronics category. 
		
		for(Product p:products) {
			if(isElectronicsCategory.test(p))
				System.out.println(p.toString());
		}
		
		//3. Print all the products from the given list of product if the product price is greaterthan 100/- which are in electronics category.
		System.out.println("#########################################################");
		Predicate<Product> priceGreaterThan100 = new Predicate<Product>() {
			@Override
			public boolean test(Product t) {
				return t.getPrice()>100.0;
			}	
		};
		
		//here we need to use predicate joins like and

		for(Product p:products) {
			if(priceGreaterThan100.and(isElectronicsCategory).test(p))
				System.out.println(p.toString());
		}
		
		
		//4. Print all the products from the given list of product if the product price is greaterthan 100/- or product is in electronics category.
		
		//here we need to use predicate joins like or
		System.out.println("#########################################################");
		for(Product p:products) {
			if(priceGreaterThan100.or(isElectronicsCategory).test(p))
				System.out.println(p.toString());
		}
		
		//5. Print all the products from the given list of product if the product price is lessthan 100/- and product is in electronics category.
		
		//here we need to use predicate joins like negate
		System.out.println("#########################################################");
		for(Product p:products) {
			if(priceGreaterThan100.negate().and(isElectronicsCategory).test(p))
				System.out.println(p.toString());
		}		
		
	}

}
