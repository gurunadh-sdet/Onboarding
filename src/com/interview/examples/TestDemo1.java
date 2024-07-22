package com.interview.examples;

public class TestDemo1 {

	public static void main(String[] args) {	
		
		int[] input = {4,3,6,5,2,8,25,10,15,5,20};
		//int l =input.length;
		int sum =30;
		System.out.println("Finding triplets################");
	findTriplets(input,sum);
	System.out.println("Finding Sub arrays: ##################");
	findSubArrays(input, 13,3);	
		
	}
	
	public static void findTriplets(int[] input, int sum) {
		int l =input.length;
		
		//positive integers
		//subarrays of length with sum= 30 //triplets
		
		for(int i =0;i<l-2;i++) { //l-3  4,
			for (int j=i+1;j<l-1;j++) {//l-2// 3
				for(int k =j+1;k<l;k++) {//l-1
					if(input[i]+input[j]+input[k]==sum) {
						
						System.out.println(input[i]+" "+input[j]+" "+input[k]);
					}
					
				}
			}
		}
	}
	
	public static void findSubArrays(int[] input, int sum, int num) {
		int l =input.length;
			
		for(int i =0;i<l-2;i++) { //l-3  4,
		
					if(input[i]+input[i+1]+input[i+2]==sum) {
						
						System.out.println(input[i]+" "+input[i+1]+" "+input[i+2]);
					}				
				
		}
	}
	
	
		
}
/*
		
		
		for(int i =0;i<l-n-1;i++) { //
//			while(n>0) {
//				
//			sum= input[n+i]+input[i+]
//			
//			n--;
//			}
			for(k=0;k<n;k++>) {
				
			if(input[i]+input[i+1]+input[i+2]==sum) {
						//int[] res= new int[3];	
						System.out.println(i+" "+j+""+k);
					}
					
				}
			}
		}
		
			
		
		
		
		
		
	}

}
*/
