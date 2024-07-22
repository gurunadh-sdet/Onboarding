package epam.corejava.conditions;

public class BlockString {
/*	 Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

			 maxBlock("hoopla") ? 2
			 maxBlock("abbCCCddBBBxx") ? 3
			 maxBlock("") ? 0 */
	public static void main(String[] args) {
		System.out.println(blockOfString("hoopla")); //2
		System.out.println(blockOfString("abbCCCddBBBxxxxx")); //5
		System.out.println(blockOfString("")); //0
		System.out.println(blockOfString("g")); //1
		System.out.println(blockOfString("ggggg")); //5
	}
	
	public static int blockOfString(String str) {
		if(str.isEmpty())
			return 0;
		if(str.length()==1)
			return 1;
		char[] chars = str.toCharArray();
		int counter =1;
		int result =0;
		for(int i=0;i<chars.length-1;i++) {
			if(chars[i]==chars[i+1])
				counter++;
			else {
				counter =1;
			}
			if(counter>result)
				result=counter;
		}
		return result;
	}

}
