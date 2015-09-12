public class Solution {
 
    // 372 ms faster than 29% of submissions
    //  with a syso - TLE
    public static int maxSubArray(int[] nums) {
        
    	int max = nums[0];
    	int currentSum = nums[0];

    	for (int i = 1; i < nums.length; i++) {
			
			// System.out.println("cs: "+ currentSum);

    		System.out.println("i:"+i);

    		if (currentSum + nums[i] > nums[i]) {
    			currentSum = currentSum + nums[i];
    		} else {
    			currentSum = nums[i];    			
    		}
    		
    		max = Math.max(currentSum,max);
    	}

    	return max;
    }


    //336 ms beats 75%
    public int maxSubArray1(int[] nums) {
        int max = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            
            if (currentSum + nums[i] > nums[i]) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];               
            }
            
            if (currentSum > max) {
                max = currentSum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
    	
    	int[] nums = {-2};

    	System.out.println(maxSubArray(nums));
    }
}