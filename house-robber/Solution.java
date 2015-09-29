public class Solution {
    
    public int rob(int[] nums) {

        if (nums.length < 1) {
            return 0;
        }
        
        if (nums.length == 1) {
            return nums[0];
        }
    
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        if (nums.length == 3) {
            return Math.max(nums[1], nums[0]+nums[2]);
        }
        
 	    int[] max = new int[nums.length];
 	    max[0] = nums[0];
 	    max[1] = nums[1];
 	    max[2] = nums[2]+nums[0];
 	    int maximum = Math.max(max[1],max[2]);

 	    for (int i=3; i<nums.length; i++) {
 		     max[i] = Math.max(max[i-2] + nums[i], max[i-3]+nums[i]);
 		     maximum = Math.max(maximum, max[i]);
 	    }
 	    
 	    return maximum;
    }
}