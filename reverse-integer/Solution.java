public class Solution {
    public int reverse(int num) {
      	int reversedNumber=0;
		while(num != 0) {
			reversedNumber = reversedNumber*10 + num % 10;
			num = num/10;
		}
		return reversedNumber;
	}
    
}