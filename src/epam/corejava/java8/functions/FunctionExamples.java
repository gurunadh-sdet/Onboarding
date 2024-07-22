package epam.corejava.java8.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import epam.corejava.java8.beans.Product;

public class FunctionExamples {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Laptop", 1200.0, "Electronics", "A"));
		products.add(new Product("Smartphone", 800.0, "Electronics", "B"));
		products.add(new Product("Watch", 1700.0, "Accessories", "C"));
		products.add(new Product("HeadPhones", 90.0, "Electronics", "Premium"));
		products.add(new Product("Shoes", 600.0, "Clothing", "A"));
		
		// 1. Write a function to calculate the cost of all products in a given list of products. 
		Function<List<Product>, Double> costOfAllProducts = t->{ //this t holds list of products
				double sum =0.0;
				for(Product p:t)
				sum= sum+p.getPrice();
				return sum;
				
			};		
		System.out.println("cost of all products: "+costOfAllProducts.apply(products));
		
		// 2. Write a function to calculate the cost of all products whose prices is > 1000/- in the given list of products.
		
		Function<List<Product>, Double> costOfAllProductsGreaterThan1000 = t->{ //this t holds list of products
			double sum =0.0;
			for(Product p:t) {
				if(p.getPrice()>1000.0)
					sum= sum+p.getPrice();
			}
			return sum;
			
		};		
		System.out.println(" the cost of all products whose prices is > 1000:   "+costOfAllProductsGreaterThan1000.apply(products));
		// we can do it using another function here to get the list of products whose price is greater than 1000
	
		Function<List<Product>, List<Product>> productsGreaterThan1000 = t->{ //this t holds list of products
			 List<Product> productsPriceabove1000 = new ArrayList<>();
			for(Product p:t) {
				if(p.getPrice()>1000.0)
					productsPriceabove1000.add(p);			
			}
			return productsPriceabove1000;
			
		};
	
		System.out.println(" 2. the cost of all products >1000 is:  "+costOfAllProducts.compose(productsGreaterThan1000).apply(products));
		
		//3. Write a function to calculate the cost of all electronic products in the given list of products. 
		Function<List<Product>, List<Product>> filterElectronics = t->{ //this t holds list of products
			 List<Product> electronicProducts = new ArrayList<>();
			for(Product p:t) {
				if(p.getCategory().equalsIgnoreCase("Electronics"))
					electronicProducts.add(p);			
			}
			return electronicProducts;
			
		};	
		System.out.println(" 3. the cost of all electronic products in the given list of products:   "+filterElectronics.andThen(costOfAllProducts).apply(products));
		
		//4. Write a function to get all the products whose price is is > 1000/- and belongs to electronic category. 
		System.out.println(" 4. all the products whose price is is > 1000/- and belongs to electronic category "+filterElectronics.andThen(productsGreaterThan1000).apply(products));
	
	}

}
