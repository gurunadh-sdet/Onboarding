package epam.corejava.conditions;

public class Number6 {
// 2. The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. 
//Or if their sum or difference is  6. Note: the function Math.abs(num) computes the absolute value of a number.
	public static void main(String[] args) {
		System.out.println(checkfor6(6,1));
		System.out.println(checkfor6(2,6));
		System.out.println(checkfor6(2,4));
		System.out.println(checkfor6(1,7));
		System.out.println(checkfor6(10,3));
		System.out.println(checkfor6(2,3));

	}
	
	public static boolean checkfor6(int a , int b) {
		if(a==6||b==6||(a+b==6)||Math.abs(a-b)==6)
			return true;
		
		
		return false;
		
	}

}
