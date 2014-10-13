import java.util.Arrays;


public class Solution {
    
    static void merge(int A[], int m, int B[], int n) {
        
        int max=m;
        int i=0,j=0;

        while (j<n && i<max) {

            if(A[i] > B[j]) {

                int k=max-1;
                while(k>=i) {
                    A[k+1]=A[k];
                    k--;
                }
                
                A[i]=B[j];
                
                // insertion done increase max
                max++;
                j++; i++;
            } else {
                i++;
            }

        }

        if (j < n) {
            while(j<n){
                A[max]=B[j];
                j++;
                max++;
            }
        }

        //System.out.println(Arrays.toString(A));
        
    }

    public static void main(String[] args) {
        int[] A={1,2,5,8,10,12,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int[] B={0,4,6,15,17,18,19,20,21,22,23,24};

        merge(A,7,B,12);
    }
}