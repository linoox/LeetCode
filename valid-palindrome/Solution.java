import java.util.Arrays;


public class Solution {

	public static boolean isPalindrome(String str) {

		str = str.toLowerCase();
		String cleanedString = str.replaceAll("[^a-zA-Z0-9]","");
		// System.out.println(cleanedString);
		int len = cleanedString.length();
		for (int i=0;i<len/2;i++) {
			if(cleanedString.charAt(i) != cleanedString.charAt(len-1-i))
				return false;
		}

		return true;

	}


	public static void main(String[] args) {
		String s1 = "A man, a plan, a canal: Panama";
		String s2 = "race a car";

		System.out.println(isPalindrome(s1));
		System.out.println(isPalindrome(s2));
	}

}