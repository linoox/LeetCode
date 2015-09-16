/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// v poor perfomance and O(n) space

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        
        
        
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        Stack<Integer> nodeStack = new Stack<Integer>();
        int length = 1;
        
        nodeStack.push(slowPtr.val);
        
        while (fastPtr.next != null) {
            fastPtr = fastPtr.next;
            length++;
            
            
            if (fastPtr.next != null) {
                length++;
                fastPtr = fastPtr.next;
                slowPtr = slowPtr.next;
                nodeStack.push(slowPtr.val);
                
            }
        }
        
        if (length % 2 == 1) {
            nodeStack.pop();
        }
        
        slowPtr = slowPtr.next;
        
        // System.out.println("stack size:"+nodeStack.size());
        
        while (slowPtr != null) {
            
            if (slowPtr.val != nodeStack.pop())
                return false;    
            
            
            slowPtr = slowPtr.next;
            
        }
        
        
        return true;
    }
}