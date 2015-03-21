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
    public boolean isBalanced(TreeNode root) {
       if (root == null)  {
           return true;
       }
       
       int heightLeft = height(root.left);
       int heightRight = height(root.right);
       
       // every subtree must be height balanced
       if (Math.abs(heightLeft - heightRight) <=1 && isBalanced(root.left) && isBalanced(root.right))
            return true;
        
        return false;
    }
    
    int height(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(height(node.left),height(node.right));
        }
    }
}