package com.interview.examples;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = {3,6,8,12,36,39,46,52,64,75,84,96};
		System.out.println(searchNumber(nums,0,nums.length-1,36));
		

	}
	
	public static boolean searchNumber(int[] list, int l, int r,int num ) {
		int mid =0;
		
		while(l<=r) {
			mid = (l+r)/2;
			if(list[mid]==num)
				return true;
			else if(list[mid]>num) {
				r=mid-1;
			}
			else if (list[mid]<num) {
				l=mid+1;
			}
		}
		
		return false;
		
	}

}
