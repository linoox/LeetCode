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
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> result = new ArrayList<Integer>();
        if (root == null)
            return result;
        Queue<TreeNode> cq = new LinkedList<TreeNode>();
        Queue<TreeNode> nq = new LinkedList<TreeNode>();
        Queue<TreeNode> temp = new LinkedList<TreeNode>();
        
        cq.add(root);
        List<Integer> list = new ArrayList<Integer>();

        while (!cq.isEmpty()) {
            TreeNode n = cq.poll();
            list.add(n.val);
            // add left , right child to nq
            if (n.left != null)
                nq.add(n.left);
            if (n.right != null)
                nq.add(n.right);

            if (cq.isEmpty()) {	// traversed all nodes on the current level
                //cq.addAll(nq);
                
                cq=nq;
                nq=new LinkedList<TreeNode>();
                //nq.clear();
                result.add(list.get(list.size()-1));
                list.clear();
            }
        }
        return result;
    }
}