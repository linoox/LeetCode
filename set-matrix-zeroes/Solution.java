public class Solution {
    public void setZeroes(int[][] matrix) {
       
        
        int[] zeroRows = new int [matrix[0].length];
        int[] zeroCols = new int [matrix.length];
        
              
       for (int j=0; j<matrix.length; j++)
        for (int i=0; i<matrix[0].length; i++) {
            if (matrix[j][i] == 0) {
        
            	zeroCols[j]=1;
            	zeroRows[i]=1;
            }
        }
       
       for (int j=0;j<matrix.length;j++)
    	   for (int i=0;i<matrix[0].length;i++) {
    		   if (zeroRows[i] == 1) {
    			   matrix[j][i] = 0;
    		   }
    		   
    		   if (zeroCols[j] == 1) {
    			   matrix[j][i] = 0;
			   }
       }
       
      
    
    }
}