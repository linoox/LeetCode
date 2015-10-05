public class Solution {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        
        return findMin(nums, lo, hi);
    }
    
    public int findMin(int[] nums, int lo, int hi) {
        if (lo == hi)
            return nums[lo];
            
        if (hi-lo == 1) {
            return Math.min(nums[lo],nums[hi]);
        }    
        
        int mid = lo + (hi-lo)/2;
        
        if (nums[lo] < nums[hi]) {
            return nums[lo];
        } else if (nums[mid] > nums[lo]) {
            return findMin(nums, mid, hi);
        } else {
            return findMin(nums, lo, mid);
        }        
        
    }
}