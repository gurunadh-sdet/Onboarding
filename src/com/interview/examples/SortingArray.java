package com.interview.examples;

public class SortingArray {

	public static void main(String[] args) {
		int[] list = { 40,32, 6, 18,10, 23, 30,7,2};
		sortTheArray(list);

	}
	public static void printArray(int[] n) {
		for(int k:n) {
			System.out.println(k);
		}
	}

	public static void sortTheArray(int[] A) {
		int temp;
		int l =A.length;
		
		for(int i=0;i<l-1;i++) {
			for(int j=i+1;j<l;j++) {
				if (A[i]>A[j]) {
					temp =A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}		
		
	}
		printArray(A);
		
	}
	

}
