package epam.corejava.basics;

import java.util.Scanner;

public class Calculator {
	  
	public static void main(String[] args) {
		
	        if (args.length != 3) {
	            System.out.println("Usage: java Calculator <number1>  <number2> <Operation>('Add', 'Substract', 'Multiplication', 'Division', 'Remainder','Percentage')");
	            System.exit(1);
	        }
	        double num1 = Double.parseDouble(args[0]);
	        double num2 = Double.parseDouble(args[1]);
	        String operation = args[2]; 
	        
	 /*Below is the code to take the inputs from the scanner class       
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter first number: ");
	        double num1 = scan.nextDouble();
	        System.out.println("Enter second number: ");
	        double num2 = scan.nextDouble();
	        System.out.println("Enter Operation: ");
	        String operation = scan.next(); //*/
	        
	       
	        double result = 0.0;

	        switch (operation) {
	            case "Add":
	                result = add(num1, num2);
	                break;
	            case "Substract":
	                result = subtract(num1, num2);
	                break;
	            case "Multiplication":
	                result = multiply(num1, num2);
	                break;
	            case "Division":
	                result = divide(num1, num2);
	                break;
	            case "Remainder":
	                result = calculateRemainder(num1, num2);
	                break;
	            case "Percentage":
	                result = calculatePercentage(num1, num2);
	                break;
	            default:
	               // System.out.println("Invalid operator. Please use one of 'Add', 'Substract', 'Multiplication', 'Division', 'Remainder','Percentage'");
	                //System.exit(1);
	            	 // Throw exception for unknown operation
                    throw new IllegalArgumentException("Unknown operation type mentioned: " + operation);
	        }

	        System.out.println("Result: " + result);
	    }

	    public static double add(double x, double y) {
	        return x + y;
	    }

	    public static double subtract(double x, double y) {
	        return x - y;
	    }

	    public static double multiply(double x, double y) {
	        return x * y;
	    }

	    public static double divide(double x, double y) {
	        if (y == 0) {
	            System.out.println("Error: Cannot divide by zero!");
	            System.exit(1);
	        }
	        return x / y;
	    }

	    public static double calculatePercentage(double x, double y) {
	        return (x / 100) * y;
	    }

	    public static double calculateRemainder(double x, double y) {
	        return x % y;
	    }
	}



