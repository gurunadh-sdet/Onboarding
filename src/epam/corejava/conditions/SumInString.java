package epam.corejava.conditions;

public class SumInString {
	/*
	 *  Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
	 *   A number is a series of 1 or more digit chars in a row. 
	 *   (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
	 */

	public static void main(String[] args) {
		//String str = "abc123xyz";
				//sumNumbers("abc123xyz") ? 123
				//sumNumbers("aa11b33") ? 44
					//	sumNumbers("7 11") ? 18
		System.out.println(sumNumbers("abc123xyz")); //123
		System.out.println(sumNumbers("aa11b33"));// 44
		System.out.println(sumNumbers("7 11"));// 18
		System.out.println(sumNumbers("a1b2c3"));// 6
	}
	
	public static int sumNumbers(String str) {
		 if (str == null || str.isEmpty()) {
	            return 0;
	        }
		char[] chars = str.toCharArray();
		int sum =0;
		String temp="0";
		
		for(char c: chars) {
			if (Character.isDigit(c)) {
				temp = temp +c;
			}else {
				sum =sum+ Integer.parseInt(temp);		
				temp="0";	
			}		
		}
		
	return sum+ Integer.parseInt(temp);		
	}

}
