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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (null == root) {
            return false;
        }
        
        Queue<TreeNode> nodeList = new LinkedList<TreeNode>();
        Queue<Integer> incrementalSum = new LinkedList<Integer>();
        
        nodeList.add(root);
        incrementalSum.add(root.val);
        
        while(!nodeList.isEmpty()) {
            TreeNode currentNode = nodeList.poll();
            int currentSum = incrementalSum.poll();
            
            if((currentNode.left == null && currentNode.right == null) && currentSum == sum) {
               return true; 
            } 
            
            if(currentNode.left != null) {
                nodeList.add(currentNode.left);
                incrementalSum.add(currentSum+currentNode.left.val);
            }
            
            if(currentNode.right != null) {
                nodeList.add(currentNode.right);
                incrementalSum.add(currentSum+currentNode.right.val);
            }
            
        }
        
        return false;
        
    }
}