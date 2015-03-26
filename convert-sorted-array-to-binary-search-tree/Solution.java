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
    public TreeNode sortedArrayToBST(int[] num) {
        
        if (num.length == 0)
            return null;
        
        if (num.length == 1)
            return (new TreeNode(num[0]));
        
        int lo = 0;
        int hi = num.length-1;
        
        TreeNode root = createBST(num, lo, hi);
        
        return root;
        
    }
    
    public TreeNode createBST(int[] num, int lo, int hi) {
        
        if (lo > hi) {
            return null;
        }
        
        //int mid = hi - (hi+lo)/2;
        int mid = (hi+lo)/2;
        
        TreeNode node = new TreeNode(num[mid]);
        
        node.left = createBST(num, lo, mid-1);
        node.right = createBST(num, mid+1, hi);
        
        return node;
    }
}