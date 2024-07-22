package epam.corejava.java8.lambda;

public class ThreadExample {

	//4. Use Runnable interface to start a new thread and print numbers from 
	public static void main(String[] args) {
		printNumbers(10);
		printNumbersUsingLambda(8);
		
	}
	
	public static void printNumbers(int n) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<n;i++) {
					System.out.println(i);
					
				}
			}
			
		});
		thread.start();
		
	}
	
	//USsing Lambda Expressions
	
	public static void printNumbersUsingLambda(int n) {
		Thread thread = new Thread(
				()->{
				for(int i=0;i<n;i++) 
					System.out.println(i);
			});
		thread.start();
		
	}

}
