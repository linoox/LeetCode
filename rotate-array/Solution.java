import java.util.Arrays;

public class Solution {

	// brute force: no brainer.
    // roatate right by k
    public static void rotate(int[] nums, int k) {

        int len = nums.length;

        if(len <= 1) 
        	return;

        int[] numsNew = new int[len];

        if(k > len) {
        	k = k % len;
        }

        for (int i=0;i<k ;i++ ) {
        	numsNew[k-1-i] = nums[len-1-i];
        }

        for (int i = 0; i < len-k; i++ ) {
        	numsNew[k+i] = nums[i];        	
        }

        for (int i=0;i<len ;i++ ) {
        	nums[i] = numsNew[i];
        }
       
        //System.out.println(Arrays.toString(nums));

    }


    public static void rotateLeftByk(int[] nums, int k) {

        int len = nums.length;

        if(len <= 1) 
        	return;

        int[] numsNew = new int[len];

        if(k > len) {
        	k = k % len;
        }

        for (int i = k; i < len; i++ ) {
        	numsNew[i-k] = nums[i];        	
        }

        for (int i=0;i<k ;i++ ) {
        	numsNew[len-k+i] = nums[i];
        }

        for (int i=0;i<len ;i++ ) {
        	nums[i] = numsNew[i];
        }
       
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
    		
    	int[] nums = {1,2,3};
    	int k = 1;	

    	rotate(nums,k);
    }
}