import java.util.Map;
import java.util.HashMap;

public class Solution {


    // memoized version
    // accepted

    public static int numTrees(int n) {
        
        if (n == 0 || n == 1) {
            return 1;
        }        

        int count = 0;                
        Map<Integer,Integer> treesCountLookUpTable = new HashMap<Integer, Integer>();

        count = numTrees(n, treesCountLookUpTable);        
        
        return count;
    }


    public static int numTrees(int n, Map<Integer,Integer> treesCountLookUpTable) {

        if(treesCountLookUpTable.containsKey(n)) {            
            return treesCountLookUpTable.get(n);

        } 

        int count=0;

        if (n == 0 || n == 1) {
            return 1;
        }  

        for (int i = 1; i <= n; i++) {
            int left = numTrees((i-1),treesCountLookUpTable);                
            int right = numTrees((n-i),treesCountLookUpTable);                                         
                
            count += left*right;
        }

        treesCountLookUpTable.put(n,count);    
              
        return count;            
        
    }

    public static void main(String[] args) {
        
        int num = 4;
        System.out.println(numTrees(num));
    }
}