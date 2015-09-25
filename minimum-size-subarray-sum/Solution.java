import java.util.Arrays;

public class Solution {
    public static int minSubArrayLen(int s, int[] nums) {
        
        if (nums.length < 1) return 0;


        int minLength = Integer.MAX_VALUE; // dont really need max val, len+1 should be ok

        int leftIndex=0;
        int rightIndex=0;
        int sum=nums[leftIndex];

        while (rightIndex < nums.length) {
            
            if (sum < s) {
                if (rightIndex == nums.length - 1)
                    return minLength == Integer.MAX_VALUE ? 0 : minLength;                    
                sum += nums[++rightIndex];
            } else {         
                minLength = Math.min(minLength, rightIndex-leftIndex+1);
                sum -= nums[leftIndex++];                                
            }
        }
        
        return minLength;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println("len: "+minSubArrayLen(11,nums));
    }
}