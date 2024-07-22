package epam.corejava.java8.consumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

import epam.corejava.java8.beans.Product;

public class ConsumerExample {

	public static void main(String[] args) {
		
		 Product laptop = new Product("Laptop", 1200.0, "Electronics", "A");
		 productPrinter("console").accept(laptop);
		 productPrinter("file").accept(laptop);

	}
	
	//1. Given a product write a consumer to print the product to appropriate medium depending on the print parameter. If the print parameter is set to file, consumer shall log the product to file, if not print on the console.
	public static Consumer<Product> productPrinter(String print){
		Consumer<Product> consumerProduct= new Consumer<Product>() {

				@Override
				public void accept(Product t) {
					if(print.equalsIgnoreCase("file")) {
						//log product to file
						try(BufferedWriter writer = new BufferedWriter(new FileWriter("products.log", true))){
							writer.write(t.toString());
		                    writer.newLine();
						}
						catch(IOException e) {
							e.printStackTrace();
						}
					}
					else
						//print product to console
						System.out.println(t);							
				}
		};
		return consumerProduct;
			
	}
		

}
