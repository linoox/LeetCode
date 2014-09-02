public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int i= 0;
		while( i < len) {
			
			digits[len-1-i]=(digits[len-1-i]+1)%10;
			
			if(digits[len-1-i] != 0) break;
			
			i++;
		}
		
		//overflow
		if(digits[0] == 0)  {
			int[] plusOneDigits = new int[len+1];
			plusOneDigits[0]=1;
			for(int j=1;j<len;j++) {
				plusOneDigits[j]=digits[j-1];
			}
			return plusOneDigits;
		 } else {
			return digits;
		 }
    }
}