package epam.corejava.strings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//2. write a program to check if two strings are rotations of each other

//adding log4j logs

public class RotationString {
	private static final Logger logger = LogManager.getLogger(RotationString.class);
	

	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 ="cdeab";
		// Demonstrate different levels of logging
        logger.trace("Starting program...");
        logger.debug("String 1: " + str1);
        logger.debug("String 2: " + str2);
		System.out.println("The given strings are rotational: "+rotationStrings(str1,str2) );
		System.out.println(rotationStringsUsingConcat(str1,str2));
		
	}
	
	public static boolean rotationStrings(String S1, String S2) {
		boolean flag = false;
		if (S1.length() != S2.length()) {
            return false;
        }
		System.out.println(S1);		
		char[] chars = S1.toCharArray();
		int counter=1;
		while(counter<S1.length()) {
			char temp =chars[0];
				for(int i=1;i<chars.length;i++) {
					chars[i-1]=chars[i];	
				}
			chars[chars.length-1]=temp;
			System.out.println(String.valueOf(chars));
			if(S2.equalsIgnoreCase(String.valueOf(chars))) {
				  logger.info("The strings are rotations of each other.");
				flag =true;
			}
			counter++;
		}
		return flag;
		
	}

	public static boolean rotationStringsUsingConcat(String S1, String S2) {
		if (S1.length() != S2.length()) {
            return false;
        }
		String concated = S1+S1;
		System.out.println(concated);
		if(concated.contains(S2))
			return true;			
		return false;
		
	}
}
