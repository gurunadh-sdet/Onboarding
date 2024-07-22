package epam.corejava.collections;

import java.util.HashMap;
import java.util.Scanner;

public class MapHomeTask {

	public static void main(String[] args) {
		System.out.println("Enter the number of people: ");
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		scan.nextLine();
		//Using Map to store phone book contacts
		HashMap<String, String> phoneBook = new HashMap<String, String>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the contact name: ");
			String name = scan.nextLine();
			System.out.println("Enter the Phone Number: ");
			String phNumber = scan.nextLine();
			phoneBook.put(name, phNumber);		
		}

		//using while loop till the end of file to provide the inputs
		 while(scan.hasNextLine())
	      {
			 String query=scan.nextLine().trim();
			 if (phoneBook.containsKey(query)) {
	                System.out.println(query + "=" + phoneBook.get(query));
	            } else {
	                System.out.println("Not found");
	            }
	      }	
	}

}
