/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    public List<Integer> sortedList;

    public BSTIterator(TreeNode root) {
        sortedList = new ArrayList<Integer>();
        
        sortedList = inorderTraversal(root, sortedList);
    }
    
    public List<Integer> inorderTraversal(TreeNode node, List<Integer> sortedList) {
        if (node == null) {
            return sortedList;
        } 
        
        inorderTraversal(node.left, sortedList);
        sortedList.add(node.val);
        inorderTraversal(node.right, sortedList);
        
        return sortedList;
        
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (sortedList.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /** @return the next smallest number */
    public int next() {
        return (sortedList.remove(0));
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */