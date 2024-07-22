package epam.corejava.basics;

public class Pyramid {

	public static void main(String[] args) {
		
		System.out.println("#############  Using For loop   ############################");
		forLoopPyramid(5,1);
		System.out.println("#########################################");
		forLoopPyramid(5,2);
		System.out.println("#########################################");
		forLoopPyramid(5,3);
		System.out.println("#########################################");
		System.out.println("#############  Using While loop   ############################");
		whileLoopPyramid(5,1);
		System.out.println("#########################################");
		whileLoopPyramid(5,2);
		System.out.println("#########################################");
		whileLoopPyramid(5,3);
		System.out.println("#############  Using Do While loop   ############################");
		dowhileLoopPyramid(5,1);
		System.out.println("#########################################");
		dowhileLoopPyramid(5,2);
		System.out.println("#########################################");
		dowhileLoopPyramid(5,3);
	}
	
	public static void forLoopPyramid(int num, int x) {
		int n =0;
		for(int i =0;i<num;i++) {
			
			for(int j =num-i;j<=num;j++) { 
				System.out.print(n);
				System.out.print("\t");
				n =n+x;
			}
			System.out.println();
		}	
		
	}
	
	public static void whileLoopPyramid(int num, int x) {
		int n =0;
		int i=0;

		while(i<num) {	
			int j=num-i;
				while(j<=num) {			
				System.out.print(n+"\t" );
				n =n+x;
				j++;
			}
			System.out.println();
			i++;
		}	
		
	}
	
	public static void dowhileLoopPyramid(int num, int x) {
	        int n = 0;
	        int i = 1;
	        do {
	            int j = 1;
	            do {
	                System.out.print(n + "\t");
	                n =n+x;             
	                j++;
	            } while (j <= i);
	            System.out.println();
	            i++;
	        } while (i <= num);
	    }
		

}
