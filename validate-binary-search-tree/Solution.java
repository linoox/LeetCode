/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    
    
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        List<Integer> treeNumbers = new ArrayList<Integer>();
            
        if (root == null) return true;
            
        while (!nodeStack.isEmpty() || root != null) {
            
            if (root != null) {
                nodeStack.push(root);
                root = root.left;
            } else {
                root = nodeStack.pop();
                // visit
                treeNumbers.add(root.val);                                
                root = root.right;
            }
            
        }
        
        int prev = treeNumbers.get(0);
        System.out.println("prev="+prev);
        for (int i=1; i<treeNumbers.size();i++) {
            if (treeNumbers.get(i) > prev) {
                prev = treeNumbers.get(i);
                
            } else {
                return false;
            }
        }
        
        return true;
        
    }
}