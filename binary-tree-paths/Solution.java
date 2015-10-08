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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> paths = new ArrayList<String>();

        Stack<String> pathStack = new Stack<String>();
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();

        TreeNode lastnodevisited = null;
        
        while (!nodeStack.isEmpty() || root != null) {

            if (root != null) {
                nodeStack.push(root);
                
                if (pathStack.isEmpty()) {
                    String str = root.val+"";
                    pathStack.push(str);    
                } else {
                    String str = pathStack.peek();
                    str = str + "->" + root.val;
                    pathStack.push(str);    
                }
                
                
                root = root.left;
            } else {
                 TreeNode peekNode = nodeStack.peek();
                 if (peekNode.right != null && lastnodevisited != peekNode.right) {
                    root = peekNode.right;
                 } else {
                    //visit
                    String str = pathStack.pop();
                    if (peekNode.right == null && peekNode.left == null) {
                        paths.add(str);
                    }  

                    lastnodevisited = nodeStack.pop();
                    
                 }

            }   
                
        }

        return paths;

    }
}