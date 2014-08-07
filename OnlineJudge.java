/*
 *  Solutions to LeetCode online judge problems
 *
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineJudge {


		
	/*
	 * Q. Plus one 
	 * 
	 * Given a non-negative number represented as an array of digits, plus one to the number.
	 * The digits are stored such that the most significant digit is at the head of the list.
	 * 
	 */
	
	public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int i= 0;
		while( i < len) {
			
			digits[len-1-i]=(digits[len-1-i]+1)%10;
			
			if(digits[len-1-i] != 0) break;
			
			i++;
		}
		
		
		if(digits[0] == 0)  {
			//overflow
			int[] plusOneDigits = new int[len+1];
			plusOneDigits[0]=1;
			for(int j=1;j<len;j++) {
				plusOneDigits[j]=digits[j-1];
			}
			return plusOneDigits;
		 } else {
			return digits;
		 }
		
    }




	/*
	 * Q. Triangle
	 * 
	 * Given a triangle, find the minimum path sum from top to bottom.
	 * Each step you may move to adjacent numbers on the row below.
	 *
	 * For example, given the following triangle
	 * [
	 *		[2],
	 * 	   [3,4],
	 *	  [6,5,7],	
	 *   [4,1,8,3]
	 * ]
	 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
	 * Bonus point if you are able to do this using only O(n) extra space, 
	 * where n is the total number of rows in the triangle.
	 *
	 */

	  public int minimumTotal(List<List<Integer>> triangle) {
        
        	int minSum = 0;
        	int oldminSum = 0;
        	int newminSum = 0;
	  		for(List list: triangle) {
	  			for(Integer i : list) {
	  				oldminSum = minSum;
	  				newminSum = oldminSum+i
	  				if(newminSum < oldminSum) {
	  					minSum = newminSum;
	  				}
	  			}
	  		}
	  }
	


	/*
	 * Q. Linked List Cycle
	 *
	 * Given a linked list, determine if it has cycle in it
	 * Can you solve it without using extra space.
	 *
	 * MyNotes:
	 * I don't think my solution uses extra space other than 
	 * the two pointers.
	 *
	 */
		

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
	
    public boolean hasCycle(ListNode head) {
        	ListNode slowptr = head;
	       	ListNode fastptr = head;

	        while (fastptr != null) {
                fastptr = fastptr.next;
	       		
	       		if(fastptr == slowptr)
	       			return true;
	       	
	       	
	       		if (fastptr != null) {
	       		    fastptr = fastptr.next;
	       		}
	       		
	       		if(slowptr != null)
	       		    slowptr = slowptr.next;

        
	       			
	       }
	       
	       return false;
    }
	




	/*
	 * Q. Integer to Roman
	 * 
	 * 
	 * 
	 */	
	public static String intToRoman(int num) {
		String romanStr="";
		
	
		
		
		return romanStr;
	}
	
	
	/*
	 * Q. Roman to Integer
	 * 
	 * Notes:
	 * need to improve. The hack at the end doesn't seem right
	 * 
	 */
	public static int romanToInt(String s) {
		int number=0;
		int i = 0;
		Map<Character, Integer> romanNumerals = new HashMap<Character, Integer>();
		romanNumerals.put('I', 1);
		romanNumerals.put('V', 5);
		romanNumerals.put('X', 10);
		romanNumerals.put('L', 50);
		romanNumerals.put('C', 100);
		romanNumerals.put('D', 500);
		romanNumerals.put('M', 1000);
		
		char[] num = s.toCharArray(); 	
		
		if(num.length == 1) {
			return number = romanNumerals.get(num[0]);
		}
		
		while (i < num.length-1) {
			
			if (romanNumerals.get(num[i]) >= romanNumerals.get(num[i+1])) {
				number += romanNumerals.get(num[i]);
			} else {
				number -= romanNumerals.get(num[i]);
			}
			i++;
		}
		number += romanNumerals.get(num[i]);
		
		return number;
    }
	
	
	
	/*
	 * Q. Single Number
	 * 
	 * Given an array of integers, every element appears twice except for one. Find that single one.
	 * 
	 * Your algorithm should have a linear runtime complexity. 
	 * Could you implement it without using extra memory?
	 */
	public static int singleNumberUsingXOR(int[] A) {
		int numberNotDupe=0;
		for( int i=0;i<A.length;i++)
			numberNotDupe^=A[i];
		return numberNotDupe;
    }
	
	// Q. Single Number
	// sort the numbers and check.
	public static int singleNumberWOXOR(int[] A) {
		
		int i=0;
		if(A.length < 2) return A[i];
		if(A.length < 1) return 0;
		Arrays.sort(A);
		while(i < A.length-2) {
			if((A[i] != A[i+1]) && (A[i+1] == A[i+2])) {
				if(i==0 || A[i-1] != A[i])
				return A[i];
			}
			i++;
		}
		
		return A[A.length-1];
    }
	
	
	/*
	 * Q. Single Number II
	 * 
	 * Given an array of integers, every element appears three times except for one. Find that single one.
	 * 
	 * Your algorithm should have a linear runtime complexity. 
	 * Could you implement it without using extra memory?
	 */
	public int singleNumber3(int[] A) {
		int number=0;
		
		return number;
    }
	
	
	/*
	 * Q. Reverse Words in a String
	 * 
	 * Given an input string, reverse the string word by word.
	 * 
	 * For example,
	 * Given s = "the sky is blue",
	 * return "blue is sky the".
	 * 
	 * Clarification:
	 * What constitutes a word? 
	 * 	A sequence of non-space characters constitutes a word.
	 * 
	 * Could the input string contain leading or trailing spaces?
	 * 	Yes. However, your reversed string should not contain leading or trailing spaces.
	 * 
	 * How about multiple spaces between two words?
	 * Reduce them to a single space in the reversed string.
	 * 
	 * TODO:
	 * 		write cleaner solution.
	 * 		fails for - "   a   b " even though expected and actual matches
	 * 		output - "b a"
	 * 		expected - "b a"
	 * 
	 * 
	 */	

	public static String reverseWords(String str) {
	
	     
        if (str == null) return null;
        
        str = str.trim();
        if (str.length() < 1) return "";
        
        
		char[] charStr = str.toCharArray();
		int len = charStr.length;
		
		charStr = whitespaceRemover(charStr);
		
		// System.out.println("before reverse:");
		// System.out.println(charStr);
		
		charStr = reverser(charStr, 0, len-1);	
		
		
		// System.out.println(charStr);
		
		int start=0,end=0;
		
		for (int i=0;i<len-1;i++) {
			
			if (charStr[i] == ' ') {
				end=i-1;
				//System.out.println("call to reverser: start="+start+"|end :"+end);
				charStr = reverser(charStr,start,end);
				start=i+1;
				//System.out.println("reseting start to:"+end);
			}
		}
			
		charStr = reverser(charStr,start,end=len-1);
		
		//System.out.println(charStr);
		
		return new String(charStr);
	}
	
	// reverse words helper
	public static char[] whitespaceRemover(char[] str) {
		
		int i=0,j=0;
		int len = str.length;
		char[] strNoSpace = new char[len];
		while( i < len) {
			
			if(!(str[i] == ' ' && str[i+1] == ' ')) {
				strNoSpace[j] = str[i];
				j++;
			}
			i++;
		}
		
		
		return strNoSpace;
	}
	
	
	// reverse words helper
	public static char[] reverser(char[] str, int start, int end) {
		
		for(int i=start; i<= (start+end)/2;i++) {
			char temp = str[i];
			str[i] = str[start+end-i];
			str[start+end-i] = temp;
		}
		return str;
	}
	// reverse words




	/*
	 * Q. Reverse Integer
	 * 
	 * negative numbers? -123 -> -321
	 * numbers ending in 0? 1000 / 10
	 * integer overflow?reverse of 1000000003 overflows
	 * 
	 * 
	 */
	public static int reverse(int num) {

		int reversedNumber=0;
		while(num != 0) {
			reversedNumber = reversedNumber*10 + num % 10;
			num = num/10;
		}
		return reversedNumber;
	}
	
	/*
	 * Q. Pascal's Triangle
	 * 
	 * Given numRows, generate the first numRows of Pascal's triangle.
	 * 
	 * 		[1]
	 * 		[1,1]
	 * 		[1,2,1]
	 * 		[1,3,3,1]
	 * 		[1,4,6,4,1]
	 * 
	 * TODO:
	 * 		looks like a crappy solution. Need to find an elegant solution.
	 */
    public static List<List<Integer>> generate(int numRows) {

    	List<List<Integer>> PT = new ArrayList<List<Integer>>();
    	
    	if(numRows == 0) return PT;
    	
    	List<Integer> baseList = new ArrayList<Integer>();
    	baseList.add(1);    	
    	PT.add(new ArrayList<Integer>(baseList));
    	if (numRows == 1) return PT;
    	
    	
    	baseList.add(1);
    	PT.add(new ArrayList<Integer>(baseList));
    	if (numRows == 2) return PT;
    	
    	for (int i=2;i<numRows;i++){
    		
    		int len = baseList.size();
    		//System.out.println("len:"+len);
    		List<Integer> baseListCopy = new ArrayList<Integer>();
    		
    		for (int j=0; j<len+1; j++) {
    			
    			if(j==0 || j == len) {
    				if (j == 0) {
    				//System.out.println("bl["+j+"]" + " = b["+j+"]" );
    				baseListCopy.add(j,baseList.get(j));
    				}
    				
    				if (j == len) {
        				//System.out.println("bl["+j+"]" + " = b["+j+"]" );
        				baseListCopy.add(j,baseList.get(j-1));
        				}
    				
    			} else {
    				//System.out.println("bl["+j+"]" + " = b["+(j-1)+"]+ b["+j+"]");
    				baseListCopy.add(j,baseList.get(j-1) + baseList.get(j));
    			}
    		}
    		baseList = baseListCopy;
    		PT.add(new ArrayList<Integer>(baseList));
    	}
    	
    	//System.out.println(PT);
    
    	return PT;
    }
    	
    /*
     * Q. Pascal's Triangle II
     * Given an index k, return the kth row of the Pascal's triangle.
     * 
     * For example, given k = 3,
     * Return [1,3,3,1].
     * 
     * Note:
     * Could you optimize your algorithm to use only O(k) extra space?
     * 	
     * TODO:
     * 		looks like a crappy solution. Need to find an elegant solution.
     * 
     */
    	
    public static List<Integer> getRow(int rowIndex) {

    	List<Integer> baseList = new ArrayList<Integer>();
    	
    	
    	baseList.add(1);    	
  
    	if (rowIndex == 0) return baseList;
    	
    	
    	baseList.add(1);
    	
    	if (rowIndex == 1) return baseList;
    	
    	for (int i=2;i<rowIndex+1;i++){
    		
    		int len = baseList.size();
    		//System.out.println("len:"+len);
    		List<Integer> baseListCopy = new ArrayList<Integer>();
    		
    		for (int j=0; j<len+1; j++) {
    			
    			if(j==0 || j == len) {
    				if (j == 0) {
    				//System.out.println("bl["+j+"]" + " = b["+j+"]" );
    				baseListCopy.add(j,baseList.get(j));
    				}
    				
    				if (j == len) {
        				//System.out.println("bl["+j+"]" + " = b["+j+"]" );
        				baseListCopy.add(j,baseList.get(j-1));
        				}
    				
    			} else {
    				//System.out.println("bl["+j+"]" + " = b["+(j-1)+"]+ b["+j+"]");
    				baseListCopy.add(j,baseList.get(j-1) + baseList.get(j));
    			}
    		}
    		baseList = baseListCopy;
    		
    	}
    	
    	//System.out.println(PT);
    
    	return baseList;
    }	
	
	
	public static void main(String[] args) {
		
		/* Reverse Integer */
		System.out.println("reverse -123:"+reverse(-123));
		
		/* Single Number */
		int A[]= {1,2,4,4,1,2,5,6,7,8,6,7,8};
		System.out.println("Number that is not dupe(XOR): " +singleNumberUsingXOR(A));
		System.out.println("Number that is not dupe(W/O XOR): " +singleNumberWOXOR(A));
		
		/* Roman to Integer */
		System.out.println("Roman to Integer:"+romanToInt("MMXIV"));
		
		/* Pascal's Triangle */
		generate(5);
		
		/* Pascal's Triangle II */
		getRow(3);
	}
	
}
