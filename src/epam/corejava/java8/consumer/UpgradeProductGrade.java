package epam.corejava.java8.consumer;

import java.util.List;
import java.util.function.Consumer;
import epam.corejava.java8.beans.Product;
// 2. Write a Consumer to update the grade of the product as 'Premium' if the price is > 1000/-. Given the product list, update the grade for each product and print all of the products. 
public class UpgradeProductGrade {

	public static void main(String[] args) {
		// Example list of products
        List<Product> products = List.of(
                new Product("Laptop", 4500.0, "Electronics","Regular"),
                new Product("Smartphone", 1800.0,"Electronics", "Regular"),
                new Product("Headphones", 200.0,"Electronics", "Regular"),
                new Product("Camera", 3100.0,"Electronics", "Regular")
        );
        // Update grade of products where price > 1000
        updateGradeIfPremium(products);

        // Print all products with updated grades
        System.out.println("Products with updated grades:");
        products.forEach(System.out::println);
        
     // Update Name of products where price > 3000
        updateNameforPrice3000(products);

        // Print all products with updated name
        System.out.println("Products with updated names:");
        products.forEach(System.out::println);
        
     //  4. Print all the Premium grade products with name suffixed with '*'.
        printPremiumGrade(products);

        
	}
	

	public static void updateGradeIfPremium(List<Product> products) {
        // Define a lambda expression for Consumer interface
        Consumer<Product> updateGradeConsumer = product -> {
            if (product.getPrice() > 1000) {
                product.setGrade("Premium");
            }
        };

        // Apply consumer to each product in the list
       for(Product p:products)
    	   updateGradeConsumer.accept(p);
    }
	
	//3. Write a Consumer to update the name of the product to be suffixed with '*' if the price of product is > 3000/-. Given the product list, update the name for each product and print all of the products. 
	
	public static void updateNameforPrice3000(List<Product> products) {
        // Define a lambda expression for Consumer interface
        Consumer<Product> updateGradeConsumer = product -> {
            if (product.getPrice() > 3000) {
                product.setName(product.getName()+"*");
            }
        };

        // Apply consumer to each product in the list
       for(Product p:products)
    	   updateGradeConsumer.accept(p);
    }
	
	// 4. Print all the Premium grade products with name suffixed with '*'.
	public static void printPremiumGrade(List<Product> products) {
        // Define a lambda expression for Consumer interface
        Consumer<Product> updateGradeConsumer = product -> {
            if (product.getGrade().equalsIgnoreCase("Premium")) {
                product.setName(product.getName()+"*");
            }
        };

        // Apply consumer to each product in the list
       for(Product p:products)
    	   updateGradeConsumer.accept(p);
       // Print all products with updated name
       System.out.println("Products with updated names:");
       products.forEach(System.out::println);
       
    }

}
