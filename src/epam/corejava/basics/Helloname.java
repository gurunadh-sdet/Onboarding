package epam.corejava.basics;

public class Helloname {

	public static void main(String[] args) {
		
	        if (args.length > 0) {
	            String name = args[0];
	            System.out.println("Hello, " + name);
	        } else {
	            System.out.println("Please provide a name as a command line argument.");
	        }

	}

}
