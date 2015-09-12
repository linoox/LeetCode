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
    
    public int kthSmallest(TreeNode root, int k) {
        
        List<Integer> inorderTraversalList = new ArrayList<Integer>();
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
    
        while (!stack.isEmpty() || root != null) {
            
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode t = stack.pop();
                inorderTraversalList.add(t.val);
                root = t.right;
            }
        }
        return inorderTraversalList.get(k-1);
    }
}