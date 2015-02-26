/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// ref: wiki
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
 
    	TreeNode traverser = root;
    	Stack<TreeNode> nodeStack = new Stack<TreeNode>();
    	List<Integer> resultPostorderTraversal = new ArrayList<Integer>();
        TreeNode lastNode = null;

    	while (!nodeStack.isEmpty() || traverser != null) {
    		if (traverser != null) {    			
                nodeStack.push(traverser);    			    			
    			traverser =  traverser.left;
    		} else {
                TreeNode peekNode = nodeStack.peek();
                if (peekNode.right != null && lastNode != peekNode.right) {
                    traverser = peekNode.right;
                } else {
                    resultPostorderTraversal.add(peekNode.val);
                    lastNode = nodeStack.pop();
                }
    		}
    	}
    	return resultPostorderTraversal;
    }
}