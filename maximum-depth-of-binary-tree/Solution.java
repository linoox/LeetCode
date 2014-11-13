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

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {
     	
     	if (root == null) {
     		return 0;
     	}   

     	return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }




    public static void main(String[] args) {
		
		// todo construct function
        TreeNode tn1 = new TreeNode(5);
        TreeNode tn2 = new TreeNode(7);
        tn1.right = tn2;

	}
}