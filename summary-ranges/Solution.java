import java.util.List;
import java.util.ArrayList;

public class Solution {
 	
 	public List<String> summaryRanges(int[] nums) {
        
        List <String> ranges = new ArrayList<String>();
        
        if (nums.length < 1)
            return ranges;
        
    	int start = nums[0];
    	int end = nums[0];
    	

        int i = 1;
    	while (i < nums.length) {

    		if (nums[i] == (nums[i-1]+1)) {
    			end = nums[i];
    		} else {
    			if (end-start == 0 ){
    				ranges.add(""+end);
    			} else {
    				ranges.add(start+"->"+end);	
    			}
    			
    			start = nums[i];
    			end = nums[i];
    		}
    		i++;
    	}
    	
		if (end-start == 0 ){
    		ranges.add(""+end);
    	} else {
    		ranges.add(start+"->"+end);	
    	}    	

    	return ranges;   
    }

    public static void main(String[] args) {
    	
    	int[] nums = {0,1,2,4,6,7,8};

    	System.out.println(summaryRanges(nums));
    }
}