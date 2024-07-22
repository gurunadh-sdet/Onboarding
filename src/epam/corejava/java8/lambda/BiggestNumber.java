package epam.corejava.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//2. Find the 2nd biggest number in the given list of numbers
public class BiggestNumber {

	public static void main(String[] args) {	
		List<Integer> list = Arrays.asList(10,34,27,17,45,29,69,5);
		System.out.println(secondBiggestNum(list));
		System.out.println((secondLargestNumber(list)));
		System.out.println((secondLargestNumberUsingLambda(list)));
	}
	
	//using Collections sort
	public static int secondBiggestNum(List<Integer> nums) {
		Collections.sort(nums);
		return  nums.get(nums.size()-2);
	}
	
	//using basic for loops
	public static int secondLargestNumber(List<Integer> nums) {
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i=0;i<nums.size();i++) {
			if (nums.get(i)>firstMax) {
				secondMax = firstMax;//45
				firstMax =nums.get(i);//69
			}
			else if(nums.get(i)>secondMax &&nums.get(i)!=firstMax) {
				secondMax = nums.get(i);
			}
		}
		return secondMax;
	}
	
	//using Lambda Expressions
	public static int secondLargestNumberUsingLambda(List<Integer> nums) {
		 if (nums == null || nums.size() < 2) {
	            throw new IllegalArgumentException("Input array must have at least two elements");
	        }
		 //sort in ascending order then limit last element get the second last one
		 	//return nums.stream().mapToInt(v->v).sorted().limit(nums.size()-1).max().getAsInt();
		 //sort in descending order and skip first element
		return nums.stream().sorted((a,b)->b>a?1:-1).skip(1).findFirst().orElse(0).intValue();
	}
	
	
	

}
