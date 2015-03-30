/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionBuggy {

    // todo : fails for integer.max  & min values.
    
    public boolean isValidBST(TreeNode root) {
    
    	return (isValidBST(root, Integer.MIN_VALUE,Integer.MAX_VALUE));

    }

    public static boolean isValidBST(TreeNode node, int min, int max) {    	

    	if (node == null) {
    		return true;
    	} 

    	if(node.val < min || node.val > max) 
    		return false;

    	return (isValidBST(node.left,min,Math.min(node.val,max)) && isValidBST(node.right,Math.max(node.val,min),max));

    }
}
