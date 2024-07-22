package epam.corejava.conditions;

public class BaseStringExample {
	/*
	 * 8. Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") ? "He there"
withoutString("Hello there", "e") ? "Hllo thr"
withoutString("Hello there", "x") ? "Hello there"
	 */

	public static void main(String[] args) {
		System.out.println(withoutString("Hello there", "llo") );// "He there"
		System.out.println(withoutString("Hello there", "e") );// "Hllo thr"
		System.out.println(withoutString("Hello there", "x") );// "Hello there"
		System.out.println(withoutString("xxx", "xx") );// "x"
		System.out.println(withoutString("xxx", "x") );// ""
	}
	public static String withoutString(String base, String remove) {
		 // Handle edge cases
        if (base == null || remove == null || remove.isEmpty()) {
            return base;
        }
        
     // Make both strings lowercase for case-insensitive comparison
        String lowerCaseBase = base.toLowerCase();
        String lowerCaseRemove = remove.toLowerCase();
        StringBuilder result = new StringBuilder();
        int index =0;
        int removeLenght = remove.length();
        while(index<base.length()) {
        	 // Find the index of the next occurrence of remove string in base string	
        	int nextIndex = lowerCaseBase.indexOf(lowerCaseRemove,index);
        	  // If no more occurrences found, append the remaining part of base string
        	if(nextIndex==-1) {
        		result.append(base.substring(index));
        		break;
        	}else {
        		  // Append the part of base string before the occurrence of remove string
        		result.append(base.substring(index, nextIndex));
        		  // Move index past the remove string
            	index = nextIndex+removeLenght;
        	}
        	         	
        }
        
      return result.toString();
		
	}

}
