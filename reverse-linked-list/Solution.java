/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode ptr1 = null;
        
        while(head != null) {
            ListNode ptr2 = head.next;
            head.next = ptr1;    
            ListNode temp = ptr1;
            head.next = temp;
            ptr1 = head;
            head = ptr2;
        }
        return ptr1;
    }
}