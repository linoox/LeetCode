public class Solution {
    public List<List<Integer>> generate(int numRows) {
     
    	List<List<Integer>> PT = new ArrayList<List<Integer>>();
    	
    	if(numRows == 0) return PT;
    	
    	List<Integer> baseList = new ArrayList<Integer>();
    	baseList.add(1);    	
    	PT.add(new ArrayList<Integer>(baseList));
    	if (numRows == 1) return PT;
    	
    	
    	baseList.add(1);
    	PT.add(new ArrayList<Integer>(baseList));
    	if (numRows == 2) return PT;
    	
    	for (int i=2;i<numRows;i++){
    		
    		int len = baseList.size();
    		//System.out.println("len:"+len);
    		List<Integer> baseListCopy = new ArrayList<Integer>();
    		
    		for (int j=0; j<len+1; j++) {
    			
    			if(j==0 || j == len) {
    				if (j == 0) {
    				//System.out.println("bl["+j+"]" + " = b["+j+"]" );
    				baseListCopy.add(j,baseList.get(j));
    				}
    				
    				if (j == len) {
        				//System.out.println("bl["+j+"]" + " = b["+j+"]" );
        				baseListCopy.add(j,baseList.get(j-1));
        				}
    				
    			} else {
    				//System.out.println("bl["+j+"]" + " = b["+(j-1)+"]+ b["+j+"]");
    				baseListCopy.add(j,baseList.get(j-1) + baseList.get(j));
    			}
    		}
    		baseList = baseListCopy;
    		PT.add(new ArrayList<Integer>(baseList));
    	}
    	
    	//System.out.println(PT);
    
    	return PT;
    }
}