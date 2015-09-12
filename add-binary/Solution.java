public class Solution {
    public String addBinary(String a, String b) {
        
		String result = "";

		String longStr = "", shortStr = "";

		if (a.length() >= b.length()) {
			longStr = a;
			shortStr = b;
		} else {
			longStr = b;
			shortStr = a;
		}

		System.out.println("l/s:" + longStr + ":" + shortStr);
		//int i = shortStr.length();
		int i=0;
		boolean carry = false;


				
		while (i < shortStr.length()) {
		
		
			if (longStr.charAt(longStr.length()-1-i) == '1' && shortStr.charAt(shortStr.length()-1-i) == '1') {
				if (carry) {
					result = "1" + result;
				} else {
					result = "0" + result;
				}
				carry = true;
			
			} else if (longStr.charAt(longStr.length()-1-i) == '0'
					&& shortStr.charAt(shortStr.length()-1-i) == '0') {
				if (carry) {
					result = "1" + result;
				} else {
					result = "0" + result;
				}
				carry = false;
			
			} else {
				if (carry) {
					result = "0" + result;
				} else {
					result = "1" + result;
				}
		
			
			}
			i++;
		}
		
		while (i < longStr.length()) {

			if (longStr.charAt(longStr.length()-1-i) == '1') {
				if (carry) {
					result = "0"+result;
				} else {
					result = "1"+result;
					carry = false;
				}
			} else {
				if (carry) {
					result = "1"+result;
					carry=false;
				} else {
					result = "0"+result;
					carry = false;
				}
			}
			i++;
		}
		
		if(carry) result = "1"+result;

	
		return result;
	
        
    }
}