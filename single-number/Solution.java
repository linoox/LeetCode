public class Solution {
        public int singleNumber(int[] A) {
            		int i=0;
		if(A.length < 2) return A[i];
		if(A.length < 1) return 0;
		Arrays.sort(A);
		while(i < A.length-2) {
			if((A[i] != A[i+1]) && (A[i+1] == A[i+2])) {
				if(i==0 || A[i-1] != A[i])
				return A[i];
			}
			i++;
		}
		
		return A[A.length-1];
        }
}