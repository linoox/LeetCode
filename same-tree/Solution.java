/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//todo:
// do the iterative version... this one was almost same as 
// same tree problem with a minor change.
// hence thename isSameTree
// isSymmetric is simply calling same tree on sub trees
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        
        if(p != null && q != null) {
            return (p.val == q.val) 
                && isSameTree(p.left, q.right) 
                && isSameTree(p.right, q.left);
        }
        
        return false;
    }
    
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null) {
            return true;
        }
        
        return isSameTree(root.left,root.right);
    }
}