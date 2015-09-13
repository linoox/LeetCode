public class Solution {

    // stupid mistakes in earlier commits :(
    public static int searchInsert(int[] nums, int target) {
        
        int lo = 0;
        int hi = nums.length-1;
        int mid = 0;

        if (nums[0] >= target) return 0;
        
        while (lo <= hi) {
            mid = lo + (hi-lo)/2;
            if (target < nums[mid]) {
                hi = mid-1;
            } else if (target > nums[mid]) {
                lo = mid+1;
            } else {
                return mid;
            }
        }

        if(target < nums[mid])
            return mid;
        else {
            return mid+1;
        }
               
    }

    public static void main(String[] args) {
        
        int[] nums = {1,3,5,6};
        int[] nums1 = {1,3};
        int[] nums2 = {3,5,7,9,10};
        System.out.println(searchInsert(nums, 5));
        System.out.println(searchInsert(nums, 2));
        System.out.println(searchInsert(nums, 7));
        System.out.println(searchInsert(nums, 0));
        System.out.println(searchInsert(nums1, 2));
        System.out.println(searchInsert(nums2, 8));
        
    }
}