public class Solution {
    
    public static boolean isPowerOfTwo(int n) {
        
        	if (n <= 0) return false;
        	
        	if (n == 1) return true;

            while (n > 2) {
                
                if (n%2 == 0) {
                    n = n/2;
                } else{
                    return false;
                }
            }   
            
            return true;
    }

    public static void main(String[] args) {
    	System.out.println("isPowerOfTwo:" + isPowerOfTwo(14));
    }
}