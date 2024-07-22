package epam.corejava.conditions;

public class Lottery {
	//4. You have a blue lottery ticket, with ints a, b, and c on it. 
	//This makes three pairs, which we'll call ab, bc, and ac. 
	//Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. 
	//Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. 
	//Otherwise the result is 0.

	public static void main(String[] args) {
		// Example usage
        int result = checkTicket(4, 6, 8);
        System.out.println("Result: " + result); // Output should be 10
        
        result = checkTicket(14, 5, 4);  
        System.out.println("Result: " + result); // Output should be 10
        
        result = checkTicket(3, 5, 8);
        System.out.println("Result: " + result); // Output should be 0

	}
	 public static int checkTicket(int a, int b, int c) {
	        int abSum = a + b;
	        int bcSum = b + c;
	        int acSum = a + c;
	        
	        // Check if any pair sums to exactly 10
	        if (abSum == 10 || bcSum == 10 || acSum == 10) {
	            return 10;
	        }
	        
	        // Check if the sum of any pair is exactly 10 more than the sum of the other two pairs
	        if (abSum == bcSum + 10 || abSum == acSum + 10) {
	            return 5;
	        }
	        
	        // If none of the conditions are met, return 0
	        return 0;
	 }

}
