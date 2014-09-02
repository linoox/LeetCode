public class Solution {
    public List<Integer> getRow(int rowIndex) {
    
    	List<Integer> baseList = new ArrayList<Integer>();
    	
    	
    	baseList.add(1);    	
  
    	if (rowIndex == 0) return baseList;
    	
    	
    	baseList.add(1);
    	
    	if (rowIndex == 1) return baseList;
    	
    	for (int i=2;i<rowIndex+1;i++){
    		
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
    		
    	}
    	
    	//System.out.println(PT);
    
    	return baseList;
    }
}