package epam.corejava.loops;

public class SortedArrayExample {
	/*
	 * 5. Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. 
	 * The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
	 */

	public static void main(String[] args) {
		 int[] outer1 = {1, 2, 4, 6, 8, 10};
	        int[] inner1 = {2, 4, 8};
		
		System.out.println(linearIn(outer1,inner1));

	}
	public static boolean linearIn(int[] outer, int[] inner) {
		
		int counter =0;
			for(int j=0;j<inner.length;j++) {
				for(int i=0;i<outer.length;i++) {
					if(inner[j]==outer[i]) {
						counter++;
						break;
					}				
				}
				
			}
			return inner.length==counter;
		}
	
	
	
	}


