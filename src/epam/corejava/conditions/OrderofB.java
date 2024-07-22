package epam.corejava.conditions;

public class OrderofB {
	//Given three ints, a b c, return true if b is greater than a, and c is greater than b. 
	//However, with the exception that if "bOk" is true, b does not need to be greater than a.
	

	public static void main(String[] args) {
		System.out.println(inOrder(2, 2, 4, false)); //fALSE
		System.out.println(inOrder(1, 2, 1, false)); //false
		System.out.println(inOrder(1, 1, 2, true)); //true
		System.out.println(inOrder(2, 2, 4, true)); //true
		
	}
	public static boolean inOrder(int a, int b, int c, boolean bOk){
		if(bOk) {
			return c>b;
		}
		else 
			return (b>a && c>b);
					
	}

}
