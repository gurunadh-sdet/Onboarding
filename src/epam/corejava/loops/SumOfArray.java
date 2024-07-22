package epam.corejava.loops;

public class SumOfArray {
	/*
	 * 2. Given a non-empty array, return true if there is a place to split the array so
	 *  that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
	 */

	public static void main(String[] args) {
		
		System.out.println(canBalance(new int[]{1, 2, 3, 4, 5, 5}));//'â†’ true
		System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));//'â†’ false
		System.out.println(canBalance(new int[]{10,10}));//'â†’ true
		System.out.println(canBalance(new int[]{1}));//'â†’ false
		
		
	}
	public static boolean canBalance(int[] nums) {
		int totalSum=0;
		for(int n:nums) {
			totalSum=totalSum+n; //6
		}
		int leftSum =0;
		for(int i=0;i<nums.length;i++) {
			leftSum = leftSum+nums[i];
			int rightSum = totalSum-leftSum; //5, 6-1-1 =4
			if(leftSum ==rightSum) {
				return true;
			}	
		}	
		return false;
		
	}

}
