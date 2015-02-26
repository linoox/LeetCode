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
    public List<Integer> preorderTraversal(TreeNode root) {
 
    	TreeNode traverser = root;
    	Stack<TreeNode> nodeStack = new Stack<TreeNode>();
    	List<Integer> resultPreorderTraversal = new ArrayList<Integer>();

    	while (!nodeStack.isEmpty() || traverser != null) {
    		if (traverser != null) {
    			resultPreorderTraversal.add(traverser.val);
                nodeStack.push(traverser);    			    			
    			traverser =  traverser.left;
    		} else {
    			traverser = nodeStack.pop();    			
    			traverser = traverser.right;
    		}
    	}
    	return resultPreorderTraversal;
    }
}