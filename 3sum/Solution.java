import java.util.Arrays;
import java.util.List;


 // todo: adding to list & avoid duplicates
public class Solution {
    //public List<List<Integer>> threeSum(int[] num) {
	public static void threeSum(int[] num) {
        
    	Arrays.sort(num);

    	System.out.println(Arrays.toString(num));

    	int len = num.length;

    	for (int i=0;i<len-2;i++ ) {
    		int j=i+1;
    		int k=len-1;

    		while( j < k ) {
    			if(num[i]+num[j]+num[k] == 0) {
    				System.out.println("set:"+num[i]+","+num[j]+","+num[k]);
    				k--;
    				j++;

    			} else if(num[i]+num[j]+num[k] >0) {
    				k--;
    			} else
					j++;    					
    		}
    	}


    }


    public static void main(String[] args) {
    	int[] num = {-1,0,1,2,-1,-4};
    	threeSum(num);
    }
}