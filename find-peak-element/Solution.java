public class Solution {

    // imp test cases: {1}, {1,2}
    // check prev versions of this code
    public static int findPeakElement(int[] num) {
        
        if(num.length == 1) {
            return 0;
        } else if (num.length == 2) {
            if(num[0] > num[1]) return 0;

            return 1;
        }

        int lo = 0;
        int hi = num.length-1;
        int mid = 0;

        while (lo <= hi) {
            mid = lo+(hi-lo)/2;            

            if(num[mid] >= num[mid+1] && num[mid] >= num[mid-1]) return mid;
            
            if(num[mid] <= num[mid+1]) {                
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] num = {3, 2, 1};
        System.out.println(findPeakElement(num));
    }
}