public class Solution {

	//TODO:

	// incorrect / incomplete
	// fails for [3,3] 3
	public static int removeElement(int[] A, int elem) {
		
		int len = A.length;
		int newlen=A.length;
		int j = len-1;
		int i = 0;

		if((A.length == 1) && (A[0] == elem)) {
			
			return 0;
		}

		while(i < len/2) {
		
			if(A[i] == elem) {
				
				
				// swap 
				while(A[j] != elem) 
					j--;

					int temp = A[j];
					A[j] = A[i];
					A[i] = temp;
				
				newlen--;
				i++;
			} else {
				i++;
			}	

		}

		return newlen;

	}


	public static void main(String[] args) {
		//int[] A = {1,2,3,4,2,3,2,5,6,7,2,2};
		//int[] A = {1,2,3,4};
		int[] A = {1};
		int elem = 1;

		System.out.println(removeElement(A,elem));
	}
}