import java.util.Arrays;

public class Solution {
    public static int minSubArrayLen(int s, int[] nums) {
        
        if (nums.length < 1) return 0;


        int min = Integer.MAX_VALUE;

        int leftIndex=0;
        int rightIndex=0;

        int sum=nums[leftIndex];

        while (rightIndex < nums.length) {

            
            if (sum < s) {
                    if (rightIndex == nums.length-1) {
                       if ( min == Integer.MAX_VALUE) {
                            return 0;
                        } else {                    
                            return min;
                        }
                    }

                rightIndex++;                
                sum = sum + nums[rightIndex];
            } else {         

                min = Math.min(min, rightIndex-leftIndex+1);
                sum = sum - nums[leftIndex];
                leftIndex++;
                
            }
        }
        

        return min;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println("len: "+minSubArrayLen(11,nums));
    }
}