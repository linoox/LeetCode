public class Solution {
    
    public static int lengthOfLastWord(String s) {
        
    	String[] tokens = s.split("\\s");

    	if(tokens.length == 0)
    		return 0;

    	int len = tokens.length;
    	return tokens[len-1].length();

    }

    public static void main (String[] args) {
    	String str = "the world is beautiful";

    	System.out.println(lengthOfLastWord(str));

    }
}