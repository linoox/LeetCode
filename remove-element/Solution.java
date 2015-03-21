public class Solution {

	// todo: doesnt look elegant :(
	// find alternate solution

    public static int removeElement (int[] nums, int target) {
		int match = 0;
		int swpIdx = nums.length-1;
		
		//System.out.println("target = 1");
		
		if (nums.length == 1 && nums[0] == target) 
		return 0;
		
		
		for (int i=0;i<swpIdx+1;i++) {
						
			if (nums[i] == target) {
				match++;
									
				while (swpIdx > i && (nums[swpIdx] == target))  {
						swpIdx--;
						match++;
				}
											 
				// nums[swpIdx] != target
				int temp = nums[swpIdx];
				nums[swpIdx] = nums[i];
				nums[i] = temp;
				swpIdx--;
																	
			if (swpIdx <= i) {
				break;
			}
						
		}			
	}		
		// System.out.println("matches:" + match);
		// System.out.println("newLength:" + (nums.length-match));
		return (nums.length-match);	
 }
}