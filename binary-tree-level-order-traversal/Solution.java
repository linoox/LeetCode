/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//todo: fix the bug
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> childNodes = new LinkedList<TreeNode>();
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();

        List<List<Integer>> levelOrderNodeValues = new ArrayList<List<Integer>>();

        if (root == null) {
        	return levelOrderNodeValues;
        }

        List<Integer> currentLevel = new ArrayList<Integer>();

        childNodes.add(root);
        while (!childNodes.isEmpty()) {
        	TreeNode currentNode = childNodes.poll();

        	currentLevel.add(currentNode.val);

        	if (currentNode.left != null) {
        		nodes.add(currentNode.left);
        	}

        	if (currentNode.right != null) {
        		nodes.add(currentNode.right);
        	}

        	if(childNodes.isEmpty()) {
        		childNodes = nodes;
        		nodes.clear();
        		levelOrderNodeValues.add(new ArrayList<Integer>(currentLevel));
        		currentLevel.clear();
        	}

        }
        return levelOrderNodeValues;
    }
}