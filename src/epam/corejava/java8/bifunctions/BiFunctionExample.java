package epam.corejava.java8.bifunctions;

import java.util.HashMap;
import java.util.function.BiFunction;

import epam.corejava.java8.beans.Product;

public class BiFunctionExample {

	public static void main(String[] args) {
		
		// 1. Given the name and price of the product, write a Bifunction to create a product. 
		
		BiFunction<String,Double, Product> createProduct = ( name,  price)-> {
				
				return new Product(name, price);
			};
			
			Product p =createProduct.apply("Laptop", 1500.0);
			System.out.println(p);
			
		// 2. Given the Product and quantity of the products, write a BiFunction to 
		//calculate the cost of products. A cart is a map of product and quantity. Given the cart, calculate the cost of the cart.
			
			HashMap<Product,Integer> cart = new HashMap<Product, Integer>();
			cart.put(new Product("Laptop", 2000.0),4);
			cart.put(new Product("Smart Watch", 1800.0),2);
			cart.put(new Product("Glasses", 500.0),3);
			cart.put(new Product("Shoes", 800.0),6);
			//creating a BiFunction given product and quantity
			BiFunction<Product,Integer, Double> costOfProduct = (product, quantity)->{
				return product.getPrice()*quantity;
				
			};
			double costofCart =0;
			//now iterating through map and use BiFunction to get the total cost
			for(Product product:cart.keySet()) {
				
				costofCart = costofCart+costOfProduct.apply(product, cart.get(product));
			}
			System.out.println(costofCart);
			
			
	}

}
