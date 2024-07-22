package epam.corejava.arrays;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MissingNumber {
	//Have used java util logger to document the logs
	private static final Logger logger = Logger.getLogger(MissingNumber.class.getName());

	public static void main(String[] args) {
		
		// Set up logging to a file
        try {
            FileHandler fileHandler = new FileHandler("app.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error setting up file handler", e);
        }
        
     // Demonstrate different levels of logging
        logger.setLevel(Level.INFO);
        logger.info("Starting program...");
        
		int[] nums = new int [100];
		for(int i=0;i<100;i++) {
			nums[i]=i+1;
		}
		int[] newArray = removeElement(nums,54);
		System.out.println(findMissingNumber(newArray));
		System.out.println(findMissingNumberUsingTotal(newArray));
		
		
	}
	
	public static int[] removeElement(int[] nums, int ele) {
		int[] newArray = new int[nums.length - 1];
        int index = 0;
        for (int i : nums) {
            if (i != ele) {
                newArray[index++] = i;
            }
        }
        return newArray;
	}
	
	public static int findMissingNumber(int[] nums) {
		int i;
		int[] temp =new int[nums.length+1];
		for(i=0;i<temp.length;i++) {
			temp[i]=0;
		}
		for(i=0;i<nums.length;i++) {
			temp[nums[i]-1]=1;
		}
		int ans =0;
		for(i=0;i<temp.length;i++) {
			if(temp[i]==0)
				ans = i+1;
		}
		return ans;
	}
	
	public static int findMissingNumberUsingTotal(int[] nums) {
		int missing;
		int total,sum =0;
		int N =nums.length+1;
		total = (N*(N+1))/2;
		for(int i:nums) {
			sum=sum+i;
		}
		missing = total-sum;
		logger.log(Level.INFO, "The missing number is: " + missing);
		return missing;
		
		
	}
}
