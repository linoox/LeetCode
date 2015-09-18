/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
       ListNode iterator = head;
		   
		   if (head == null || (head.next == null && head.val == val))
			   return null;
		   
		   while (iterator != null && iterator.val == val) {
			   iterator = iterator.next;
		   }
		   
		   head=iterator;
		   
		   if (head == null)
		        return head;
		   
		   
		   while (iterator.next !=null ) {
			   if(iterator.next.val == val) {
			       iterator.next = iterator.next.next;
			   } else {
			       iterator = iterator.next;
			   }
		   }
		   
		   return head;
    }
}