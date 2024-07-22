package epam.corejava.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysHomeTask {

	public static void main(String[] args) {
		System.out.println("Enter the Number of lines: ");
		List<List<Integer>> list = new ArrayList();
		
		//Read the number of lines =n
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		 scan.nextLine(); // move to the next line
		for(int i =0;i<n;i++) {
			System.out.println("enter each line from n:  ");
			String line = scan.nextLine().trim();
			String[] nums = line.split("\\s+");
			ArrayList<Integer> currentLine = new ArrayList<Integer>();
			//add each line with spaces into another list
			for(String s:nums) {
				currentLine.add(Integer.parseInt(s));
			}
			System.out.println(currentLine);
			
			list.add(currentLine);
		}
		System.out.println(list);
		
		//now read the number of queries
		System.out.println("Enter the number of Queries: ");
		int q = scan.nextInt();
        scan.nextLine(); // move to the next line
        for(int j=0;j<q;j++) {
        	System.out.println("Enter the x and y: ");
        	int x =scan.nextInt();//the line index value
        	int y = scan.nextInt(); //the position to find out
        	int lineIndex = x-1;
        	int position = y-1; //considering the position as normal 1 to n 
        	if(lineIndex>=0 && lineIndex<n && position>0 && position<list.get(lineIndex).size() ) {
        		System.out.println(list.get(lineIndex).get(position-1));
        		
        	}else
        		System.out.println("ERROR!");
        	
        	
        }
        
	}

}
