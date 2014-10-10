public class Solution {

	// TLE :(

    public static int divide(int dividend, int divisor) {
        System.out.println("dividend:"+dividend+" | divisor:"+divisor);

        if (dividend == 0) {
        	return 0;
        }	

        if (divisor == 0) {
        	throw new IllegalArgumentException("Argument 'divisor' is 0");
        }

        int result=-1;
        int sign = 1;
        sign=(dividend/Math.abs(dividend))*(divisor/Math.abs(divisor));
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);

        while(dividend >=0) {
        	dividend = dividend-divisor;
        	result++;
        }

        return result*sign;

    }

    public static void main(String[] args) {
    
    	int dividend = 2147483647;
    	int divisor =  1;

    	System.out.println(divide(dividend,divisor));

    }
}