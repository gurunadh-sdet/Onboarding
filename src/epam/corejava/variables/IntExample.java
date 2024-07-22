package epam.corejava.variables;

public class IntExample {
	// 1. Daniel has 3 apples; Amber has 2 apples. How many apples do Daniel and Amber have together?

	public static void main(String[] args) {

		int danielApples = 3;
		int amberApples = 2;
		
		 // Calculate the total number of apples = sum
        int totalApples = danielApples + amberApples;
        
        //result
        System.out.println("Daniel and Amber have " + totalApples + " apples together.");
	}

}
