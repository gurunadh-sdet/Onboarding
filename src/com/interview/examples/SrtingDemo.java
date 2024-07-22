package com.interview.examples;

public class SrtingDemo {

	public static void main(String[] args) {

		//Input:   str = “Ab,c,de!$”
		//	Output:  str = “ed,c,bA!$”
		
		
		String str ="Ab,c,de!$";
		System.out.println(reverseString(str));
		
	}	
			
	public static String reverseString(String str) {
		char[] chars = str.toCharArray();
		char temp;
		
		int l=0; 
		int r = chars.length-1;
		while(l<r) {
			if(!(Character.isAlphabetic(chars[l]))){
				l++;
			}
			else if(!(Character.isAlphabetic(chars[r]))){
				r--;
			}
			else {
				temp = chars[r];
				chars[r]=chars[l];
				chars[l]=temp;
				l++;
				r--;
			}		
			
		}	
		
		return String.valueOf(chars);		

	}

}
