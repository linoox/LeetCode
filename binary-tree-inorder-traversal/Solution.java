/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
 
    	TreeNode traverser = root;
    	Stack<TreeNode> nodeStack = new Stack<TreeNode>();
    	List<Integer> resultInorderTraversal = new ArrayList<Integer>();

    	while (!nodeStack.isEmpty() || traverser != null) {
    		if (traverser != null) {
    			nodeStack.push(traverser);    			    			
    			traverser =  traverser.left;
    		} else {
    			traverser = nodeStack.pop();
    			resultInorderTraversal.add(traverser.val);
    			traverser = traverser.right;
    		}
    	}
    	return resultInorderTraversal;
    }
}