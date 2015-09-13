public class Solution {
    public static int searchInsert(int[] nums, int target) {
        
        int lo = 0;
        int hi = nums.length-1;
        int mid = 0;

        if (nums[0] >= target) return 0;
        
        while (lo <= hi) {
            mid = lo + (hi-lo)/2;
            if (target <= nums[mid]) {
                hi = mid-1;
            } else {
                lo = mid+1;
            } 
        }

        if (target == nums[mid]) {
            return mid;
        } else {
            while(target < nums[mid]) {
                mid++;
            }
            return mid+1;
        }
               
    }

    public static void main(String[] args) {
        
        int[] nums = {1,3};
        System.out.println(searchInsert(nums, 2));
    }
}