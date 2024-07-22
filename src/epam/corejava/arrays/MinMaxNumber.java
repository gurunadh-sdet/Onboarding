package epam.corejava.arrays;

public class MinMaxNumber {

	public static void main(String[] args) {
		int[] nums = {5,8,2,9,16,39,3,57};
		System.out.println("the minimum number is: "+minNumber(nums));
		System.out.println("the maximum number is: "+maxNumber(nums));
	}
	
	public static int minNumber(int[] A) {
		int L = A.length;
		int min= A[0];
		for(int i=1;i<L;i++) {
			if(A[i]<min) {
				min = A[i];
			}
		}
		
		return min;
	}
	
	public static int maxNumber(int[] A) {
		int L = A.length;
		int max =A[0];
		for(int j=0;j<L;j++) {
			if(A[j]>max)
				max= A[j];
		}
		
		return max;
	}

}

