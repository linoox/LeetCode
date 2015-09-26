public class Solution {

 	// from leetcode solution
	static boolean isPalindrome(int x) {

		if(x < 0) return false;

		int div=1;
		// 
		while( x/div >= 10) {
			div*=10;
		}

		while (x != 0) {
			int left = x/div;
			int right = x%10;
			if (left != right) return false;

			x = (x%div)/10;
			div /= 100; // 10s place from left & right?

		}
		return true;
	}

	public boolean isPalindrome2(int x) {
        	  long y = x;
		  long reverse = 0;
		  while ( y > 0) {
			  
			  reverse = reverse*10 + y%10;
			  y = y/10;
			  
		  }
		  
		  if (reverse == x) {
			  return true;
		  } else {
			  return false;
		  }
    }

	public static void main(String[] args) {
		int number = 121;
		int number2 = Integer.MAX_VALUE;

		System.out.println(isPalindrome(number));
		System.out.println(isPalindrome(number2));
	}
}