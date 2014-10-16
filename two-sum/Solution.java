import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;


// TODO: 
// implement a better solution.
// 1. looks  inefficient and crappy.
// TLE on leet

public class Solution {

	static int keyFromValue(Map<Integer,Integer> inputIndexMap, Integer value, Integer idx1) {
		for(Entry<Integer,Integer> entry : inputIndexMap.entrySet()) {
			if(value.equals(entry.getValue()) && !idx1.equals(entry.getKey())) {
				
				return entry.getKey();
			}
		}
		return -1;
	}

	public static int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> inputIndexMap = new HashMap<Integer, Integer>();

		for (int i=0; i<numbers.length;i++) {
			inputIndexMap.put(i,numbers[i]);
		}

		int idx1 = -1;
		int idx2 = -1;
 		

 		for (int i=0; i<numbers.length; i++) {
 			idx1 = i;
 			Integer complementaryNumber = Math.abs(target - numbers[i]);

 			idx2 = (keyFromValue(inputIndexMap,complementaryNumber, idx1));	
 			if(idx2 >=0)
 				break;
 		}
		
		

		int[] indices = new int[2];
		indices[0] = idx1+1;
		indices[1] = idx2+1;

		return indices;

	}

	public static void main(String[] args) {
		//int[] numbers = {2, 7, 11, 15};
		//int target = 9;

		int[] numbers = {3,2,4};
		int target = 6;

		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}
}