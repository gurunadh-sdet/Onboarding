package epam.corejava.java8.lambda;

import java.util.stream.IntStream;

public class PalindromExample {
	//1. Check if a given string is a palindrome

	public static void main(String[] args) {
		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("gurunadh"));
		System.out.println(isPalindrome("asarasa"));
		System.out.println(isPalindrome("a"));
		System.out.println(isPalindrome("bb"));
		System.out.println(isPalindrome(""));
		System.out.println(isPalindromeUsingLambda("madam"));
		System.out.println(isPalindromeUsingLambda("gurun"));
		System.out.println(isPalindromeUsingLambda("a"));
		System.out.println(isPalindromeUsingLambda("bb"));
		System.out.println(isPalindromeUsingLambda("")); //empty can be returned true or false based on the condition
	}
	
	//Without Lambda Expressions
	public static boolean isPalindrome(String str) {
		if (str.isEmpty())
			return false;
		if (str.length()==1)
			return true;
		//if we need to omit space and case
		str =str.replaceAll("\\s+", "").toLowerCase();
		int left =0;
		int right =str.length()-1;
		while(left<right) {
			if (!(str.charAt(left)==str.charAt(right)))
				return false;
			left++;
			right--;
		}	
		return true;
	}
	
	//Using Lambda expression the lines of code will be significantly reduced
	
	public static boolean isPalindromeUsingLambda(String str) {
		//if we need to omit space and case
			//str =str.replaceAll("\\s+", "").toLowerCase();
		
		return IntStream.range(0, str.length()/2)
		.allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
	}

}
