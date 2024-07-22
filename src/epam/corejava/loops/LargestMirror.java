package epam.corejava.loops;

public class LargestMirror {

	public static void main(String[] args) {

		int[] nums1 = {1, 2, 3, 8, 9, 3, 2, 1};
        int[] nums2 = {1, 2, 1, 4};
        int[] nums3 = {7, 1, 2, 9, 7, 2, 1};
        
        System.out.println("Largest mirror section in nums1: " + maxMirror(nums1)); // Output: 3
        System.out.println("Largest mirror section in nums2: " + maxMirror(nums2)); // Output: 3
        System.out.println("Largest mirror section in nums3: " + maxMirror(nums3)); // Output: 2
	}
	
	public static int maxMirror(int[] nums) {
        int maxMirror = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            // Search backwards from the end of the array
            for (int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
                if (nums[j] == nums[i + count]) {
                    count++;
                } else {
                    maxMirror = Math.max(maxMirror, count);
                    count = 0;
                }
            }
            maxMirror = Math.max(maxMirror, count);
        }
        
        return maxMirror;
    }

}
