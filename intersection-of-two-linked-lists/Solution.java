/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=-1;
        int lengthB=-1;
        int intersectionPoint=0;
        
        ListNode tmp=headA;
        
        while(tmp != null) {
            tmp = tmp.next;
            lengthA++;
        }
        
        tmp = headB;
        while(tmp != null) {
            tmp = tmp.next;
            lengthB++;
        }
        
        if(lengthA > lengthB) {
            int diff = lengthA-lengthB;
            tmp=headA;
            for(int i=0; i<diff;++i) {
                tmp=tmp.next;
            }
            ListNode tmp2=headB;
            while (tmp !=null ) {
                
                if(tmp.val == tmp2.val) {
                    return tmp;
                }
                tmp=tmp.next;
                tmp2=tmp2.next;
            }
            return null;
            
        } else if (lengthB > lengthA) {
            int diff = lengthB-lengthA;
            tmp=headB;
            for(int i=0; i<diff;++i) {
                tmp=tmp.next;
            }
            ListNode tmp2=headA;
            while (tmp !=null ) {
                
                if(tmp.val == tmp2.val) {
                    return tmp;
                }
                tmp=tmp.next;
                tmp2=tmp2.next;
            }
            return null;
        } else {
            ListNode tmp2 = headB;
            tmp = headA;
            while(tmp != null) {
                if(tmp.val == tmp2.val) {
                    return tmp;
                }
                tmp=tmp.next;
                tmp2=tmp2.next;
            }
            return null;
        }
       
    }
}