public class Solution {
   
   public static String reverseWords(String s) {
       
	   s = s.trim().replaceAll("\\s+", " ");
	   
	   String[] words = s.split("\\s+");
	   String reverse = "";
	   
	   for (int i=words.length-1; i>=0; i--) {
	       reverse += " "+words[i];
	   }
	   
	   return reverse.trim();
   }
   
}