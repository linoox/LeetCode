public class Solution {

	// todo: fails for: {2,1}
	// AOO
    public static int findMin(int[] num) {
        int lo=0;
        int hi=num.length-1;
        int pivot=0;
   

        if(hi == lo) {
            return num[lo];
        }

        if(num[hi] > num[lo]) {
        	return num[lo];
        }

        while(lo < hi) {
            
            int mid = lo+(hi-lo)/2;
            
            if(mid>lo && num[mid] < num[mid-1]) {
                pivot=mid;
                break;
            } else if (num[mid] < num[hi]){
                hi=mid-1;
            } else if (num[mid] > num[hi]) {
                lo=mid+1;
            }
            return num[mid];
            
        }
        //System.out.println("pivot:"+pivot);
        return Math.min(num[0],num[pivot]);
    }

    public static void main(String[] args) {
    	int[] num = {2, 1};
    	System.out.println(findMin(num));
    }
}