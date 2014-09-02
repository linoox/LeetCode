/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
           ListNode sptr = head;
	       ListNode fptr = head;

	       while (fptr != null) {
                fptr = fptr.next;
	       		
	       		if(fptr == sptr)
	       			return true;
	       	
	       	
	       		if (fptr != null) {
	       		    fptr = fptr.next;
	       		}
	       		
	       		if(sptr != null)
	       		    sptr = sptr.next;

        
	       			
	       }
	       
	       return false;
    }
}