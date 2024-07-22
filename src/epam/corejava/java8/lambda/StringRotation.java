package epam.corejava.java8.lambda;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class StringRotation {
	
	//3. write a program to check if two strings are rotations of each other. 

	public static void main(String[] args) {
		System.out.println(areRotated("abcde", "cdeab"));
		System.out.println(areRotated("abcde", "acdeb"));
		System.out.println(areRotatedUsingLoop("abcde", "cdeab"));
		System.out.println(areRotatedUsingLoop("abcde", "acdeb"));
		System.out.println(areRotatedUsingLambda("abcde", "bcdea"));
		System.out.println(areRotatedUsingLambda("abcde", "acdeb"));

	}
	
	//using concatenation
	public static boolean areRotated(String s1, String s2) {
		// Check if both strings are not null and have the same length
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
		String concatString =s1+s1;
		if(concatString.contains(s2)) {
			return true;
		}
		else
			return false;
		
	}
	//using for loops
	public static boolean areRotatedUsingLoop(String s1, String s2) {
		char[] chars = s1.toCharArray();	
		int L = chars.length;
		while(L>0) {
			char temp =chars[0];
			for(int i=1;i<s1.length();i++) {
				chars[i-1]=chars[i];	
			}
			chars[s1.length()-1]=temp;
			if(String.valueOf(chars).equalsIgnoreCase(s2))
				return true;
			L--;
		}
		return false;
	}
	

	//using for Queue Data Structure
	public static boolean areRotatedUsingQueue(String s1, String s2) {
		Queue<Character> q1 = new LinkedList<Character>();
		for(int i=0;i<s1.length();i++){
			q1.add(s1.charAt(i));
		}
		System.out.println(q1);
		Queue<Character> q2 = new LinkedList<Character>();
		for(int i=0;i<s2.length();i++){
			q1.add(s2.charAt(i));
		}
		System.out.println(q2);
		int k =s2.length();
		while(k>0) {
			k--;
			char ch = q2.peek();
			q2.remove();
			q2.add(ch);
			if(q2.equals(q1)) 
				return true;
		}
		
		return false;		
	}
	
	
	
	//using for Lambda expressions
	public static boolean areRotatedUsingLambda(String s1, String s2) {
		int len = s1.length();
		//get all rotaions of String with below logic
		for(int i=0;i<len;i++) {
			String temp =  s1.substring(len-i, len) + s1.substring(0, len-i);
			//System.out.println(temp);
		}
		// applying lambda expressions for the above logic
		return IntStream.range(0, len).anyMatch(i->(s1.substring(len-i, len) + s1.substring(0, len-i)).equals(s2));
		  
	}

}
