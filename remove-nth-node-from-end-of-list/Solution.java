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


//todo: fails for size =1,2.
// works for example

public class Solution {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode sptr = head;
	    ListNode fptr = head;
	    ListNode hd = head;
	    int counter = 0;

	       while (fptr != null) {
                fptr = fptr.next;
                counter++;

                if(counter >= n){
	       		    sptr = sptr.next;
	       		}

	       		if (fptr != null) {
	       		    fptr = fptr.next;
	       		} else {

	       			ListNode temp = sptr.next.next;
	       			sptr.next.next = null;
	       			sptr.next = temp;

	       			return hd;
	       		
	       		}
	       		
	       }
	       
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
 		

 		ListNode ptr = removeNthFromEnd(n1,1);


 		while(ptr != null) {
 			System.out.println(ptr.val);
 			ptr=ptr.next;
 		}


    }


}