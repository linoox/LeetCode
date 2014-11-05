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


    public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode sptr = head;
	    ListNode fptr = head;
	    ListNode hd = head;
	    // int counter = 0;

	    if(n == 0 || (head==null)) {
	    	return null;
	    }

	    for (int i=0;i<n;i++) {
	     		fptr=fptr.next;	
	    } 

	    if(fptr == null) {
	    	return head.next;
	    }

	    while(fptr.next != null) {
	    	fptr = fptr.next;
	    	sptr = sptr.next;
	    }
	       
	     sptr.next = sptr.next.next;
	     return hd;
	    
    }

    static class ListNode {
      		int val;
      		ListNode next;
      		ListNode(int x) {
          		val = x;
          		next = null;
      		}
 	}

    public static void main(String[] args) {

    	

 		ListNode n1 = new ListNode(1);
 		
 		ListNode n2 = new ListNode(2);
 		ListNode n3 = new ListNode(3);
 		ListNode n4 = new ListNode(4);
 		ListNode n5 = new ListNode(5);
		

 		n1.next = n2;
 		n2.next = n3;
 		n3.next = n4;
 		n4.next = n5;
 		

 		ListNode ptr = removeNthFromEnd(n1,2);


 		while(ptr != null) {
 			System.out.println(ptr.val);
 			ptr=ptr.next;
 		}


    }


}