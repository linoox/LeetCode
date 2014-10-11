public class Solution {

	// TLE again :/
    public static int divide(int dividend, int divisor) {

        if (divisor == 0) {
        	throw new IllegalArgumentException("Argument 'divisor' is 0");
        }

        if (dividend == 0) {
        	return 0;
        }	

        int result=0;
        int sign = 1;
        int current=1;
        sign=(dividend/Math.abs(dividend))*(divisor/Math.abs(divisor));
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);

        while(divisor <= dividend) {
        	divisor <<= 1;
        	current <<= 1;
        }

        divisor >>= 1;
        current >>= 1;

        while(current != 0) {
        	if (dividend >= divisor) {
        		dividend -= divisor;
        		result |= current;
        	}
        	current >>= 1;
        	divisor >>= 1;
        }

        return result*sign;

    }

    public static void main(String[] args) {
    
    	int dividend = -75;
    	int divisor =  5;

    	System.out.println(divide(dividend,divisor));

    }
}