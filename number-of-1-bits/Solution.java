public class Solution {
    // you need to treat n as an unsigned value
    public static int hammingWeight(long n) {
        
        long n1 = n;
        int count = 0;
        
        while (n > 0) {
            count += n & 1;
            n >>> = 1;
        }
        
        return count;
    }

    public static void main(String[] args) {
    	System.out.println(hammingWeight(2147483648));
    }
}