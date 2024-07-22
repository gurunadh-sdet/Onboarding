package epam.corejava.loops;

public class SpanExample {
	
	/*
	 * 1. Consider the leftmost and righmost appearances of some value in an array. 
	 * We'll say that the "span" is the number of elements between the two inclusive. 
	 * A single value has a span of 1. Returns the largest span found in the given array. 
	 * (Efficiency is not a priority.)
	 * maxSpan([1, 2, 1, 1, 3]) â†’ 4
		maxSpan([1, 4, 2, 1, 4, 1, 4]) â†’ 6
		maxSpan([1, 4, 2, 1, 4, 4, 4]) â†’ 6
	 */

	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 1, 3};
		System.out.println(maxSpan(new int[] {1, 2, 1, 1, 3}));
		System.out.println(maxSpan(new int[] {1, 4, 2, 1, 4, 1, 4}));
		System.out.println(maxSpan(new int[] {1, 4, 2, 1, 4, 4, 4}));
		System.out.println(maxSpan(new int[] {1, 2, 1, 1, 3,1,1}));
		System.out.println(maxSpan(new int[] {1}));
		System.out.println(maxSpan(new int[] {}));
		
		
	}
	public static int maxSpan(int[] arr) {
		if (arr.length==0)
				return 0;
		int maxSpan =0;
		int currentSpan =1;//minimum span will be 1 for single element
		for(int i=0;i<arr.length;i++) {
			int num =arr[i];//1
			for(int j =1;j<arr.length;j++) {
				if(arr[j]==num) {
					currentSpan =j-i+1;
				}
			}
			if(currentSpan>maxSpan)
				maxSpan = currentSpan;
		}
		return maxSpan;
		
	}

}
