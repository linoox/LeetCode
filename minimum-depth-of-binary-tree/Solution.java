/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 // tweaked hasPathSum code slightly.. there got to be a better solution
public class Solution {
    
    public int minDepth(TreeNode root) {
        int minHeight=0;
        if (null == root) {
            return minHeight;
        }
        
        Queue<TreeNode> nodeList = new LinkedList<TreeNode>();
        Queue<Integer> incrementalHeight = new LinkedList<Integer>();
        
        nodeList.add(root);
        incrementalHeight.add(1);
        
        while(!nodeList.isEmpty()) {
            TreeNode currentNode = nodeList.poll();
             int currentHeight = incrementalHeight.poll();
            
            if((currentNode.left == null && currentNode.right == null)) {
               minHeight=currentHeight;
               return minHeight; 
            } 
            
            if(currentNode.left != null) {
                nodeList.add(currentNode.left);
                incrementalHeight.add(currentHeight+1);
            }
            
            if(currentNode.right != null) {
                nodeList.add(currentNode.right);
                incrementalHeight.add(currentHeight+1);
            }
            
        }
        
        return minHeight;
    }
}