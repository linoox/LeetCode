import java.util.Arrays;

public class Solution {

	public static void sortColors(int[] A) {

		int[] counter = {0,0,0};
		int NUM_COLORS = 3;
		for(int i=0;i<A.length;i++) {
			counter[A[i]]++;
		}

		//System.out.println(Arrays.toString(counter));

		for (int k=0,i=0;i<NUM_COLORS;i++) {
			for (int j=0;j<counter[i];j++) {
				A[k++]=i;
			}
		}

		//System.out.println(Arrays.toString(A));
	}

	public static void main(String[] args) {

		int[] A = {0,2,2,2,1,2,0,2,1,1,0};

		sortColors(A);
	}
}