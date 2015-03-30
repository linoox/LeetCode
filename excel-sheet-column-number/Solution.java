import java.util.Map;
import java.util.HashMap;

public class Solution {
    
	// todo: formula can be tweaked
    public static int titleToNumber(String s) {
        
    	// charAt index is the power.
    	Map<Character,Integer> charMap = new HashMap<Character, Integer>();

    	charMap.put('A',1);charMap.put('H',8);charMap.put('O',15);
    	charMap.put('B',2);charMap.put('I',9);charMap.put('P',16);
    	charMap.put('C',3);charMap.put('J',10);charMap.put('Q',17);
    	charMap.put('D',4);charMap.put('K',11);charMap.put('R',18);
    	charMap.put('E',5);charMap.put('L',12);charMap.put('S',19);
    	charMap.put('F',6);charMap.put('M',13);charMap.put('T',20);
    	charMap.put('G',7);charMap.put('N',14);charMap.put('U',21);
    	
    	charMap.put('V',22);
    	charMap.put('W',23);
    	charMap.put('X',24);charMap.put('Y',25);charMap.put('Z',26);

    	int excelNumber=0;
    	int len = s.length();

    	for (int i=len-1;i>=0; i-- ) {
    		
    		excelNumber += (Math.pow(26,(len-1-i))*charMap.get(s.charAt(i)));
    		
    	}

    	return excelNumber;

    }

    public static void main(String[] args) {
    	String s  = "A";
    	String s1 = "AA";
    	String s2 = "AB";
    	String s3 = "BA";


    	System.out.println(titleToNumber(s));
    	System.out.println(titleToNumber(s1));
    	System.out.println(titleToNumber(s2));
    	System.out.println(titleToNumber(s3));
    }
}