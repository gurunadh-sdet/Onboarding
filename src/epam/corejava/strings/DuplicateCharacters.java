package epam.corejava.strings;

import java.util.HashMap;
import java.util.Map.Entry;

//1. write a program to Print duplicate characters from String 

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		String str = "Test Automation";
		System.out.println("The duplicate characters in the given string are : " );
		findDuplicateCharacters(str);
		findDuplicateCharactersUsingMap(str);
	}
	
	public static void findDuplicateCharacters(String S) {
		char[] chars = S.toCharArray();
		for(int i =0;i<chars.length;i++) {
			//chars[i]
					for(int j=i+1;j<chars.length;j++) {
						if(chars[i]==chars[j]) {
							System.out.println(chars[j]);
						}
						
					}
		}
	}
	
	public static void findDuplicateCharactersUsingMap(String S) {
		HashMap<Character, Integer> charmap = new HashMap<Character,Integer>();
		char[] chars = S.toCharArray();
		for(char c: chars) {
			if(charmap.containsKey(c))
				charmap.put(c, charmap.get(c)+1);
			else
				charmap.put(c, 1);
		}
		
		for(Entry<Character, Integer> entry :charmap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("The Duplicate characters of: "+entry.getKey()+" is "+entry.getValue()+" times ");
			}
			
		}			

	}

}
