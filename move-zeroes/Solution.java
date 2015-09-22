public class Solution {
    public void moveZeroes(int[] nums) {
         int count = 0;
	     int i = 0;
	     int j = 0;
		 while (i < nums.length) {
			 if (nums[i] == 0) {
				 count++;
				 i++;
			 } else {
				 nums[j] = nums[i];
				 j++;
				 i++;
			 }
		 }
		 
		 while (nums.length - j > 0) {
			 nums[j] = 0;
			 j++;
		 }
    }
}