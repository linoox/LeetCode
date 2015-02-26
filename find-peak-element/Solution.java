public class Solution {

    // imp test cases: {1}, {1,2}
    // check prev versions of this code
    public static int findPeakElement(int[] num) {
        int lo = 0;
        int hi = num.length-1;
        int mid = 0;
        while (lo <= hi) {
            mid = lo+(hi-lo)/2;
            if(num[mid] >= num[mid+1] && num[mid] >= num[mid-1]) return mid;
            
            if(num[mid] <= num[mid+1]) {
                // a peak is in the other half
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] num = {1, 2};
        System.out.println(findPeakElement(num));
    }
}