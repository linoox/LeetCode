import java.util.Arrays;

public class Solution {


	// todo: there must be a better way to do this!
	public static int removeDuplicates(int[] A) {
		

		int len = A.length;
		
		if(len < 1)	 {
			return 0;
		}

		int newlen = len;
		int i=0,j=1;
		boolean dupe=false;

		while(j < len) {
			

			if(A[i] == A[j] || A[i] > A[j]) {
				j++;
				dupe=true;
			} else {

				if(dupe) {

					int temp = A[i+1];
					A[i+1] = A[j];
					A[j] = A[i+1];	
					
					i=i+1;
					dupe = false;

				} else {
					i++;
					j++;
				}

				


			}
		}

		return i+1;

	}

	public static void main(String[] args) {
		//int[] A = {1,1,2,2,2,3};
		// int[] A = {};
		int[] A = {1,2};

		System.out.println(removeDuplicates(A));
	}
}