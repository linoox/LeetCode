public class Solution {

    //todo: enhance?

  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (root == null)
            return result;

        Deque<TreeNode> cq = new LinkedList<TreeNode>();
        Deque<TreeNode> nq = new LinkedList<TreeNode>();        
        
        cq.add(root);
        List<Integer> list = new ArrayList<Integer>();
        boolean currentLevelOdd = false;

        while (!cq.isEmpty()) {
            TreeNode n = new TreeNode(0);
            
            if(currentLevelOdd)  {
                n = cq.removeFirst();
            } else {
                n = cq.removeLast();
            }
    
    
            list.add(n.val);
            // add left , right child to nq

            if(currentLevelOdd) {
                if (n.right != null)
                    nq.addLast(n.right);
               
                if (n.left != null)
                    nq.addLast(n.left);    
                                                
            } else {
               
               if (n.left != null)
                    nq.addFirst(n.left);    
                    
               if (n.right != null)
                    nq.addFirst(n.right);
            }
            


            if (cq.isEmpty()) {	// traversed all nodes on the current level                
                cq=nq;
                nq=new LinkedList<TreeNode>();                
                result.add(new ArrayList<Integer>(list));
                list.clear();
                
               currentLevelOdd = !currentLevelOdd;
            }
        }
        return result;
}
}