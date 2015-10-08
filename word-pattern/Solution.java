public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] tokens = str.split("\\s+");
        
        
        if (tokens.length != pattern.length()) {
            System.out.println("tl = "+tokens.length+" | pl = "+pattern.length());
            return false;
        }
        
        Map <Character, String> map = new HashMap<Character, String>();
        Map <String, Character> revmap = new HashMap<String, Character>();
        
        for (int i=0; i < pattern.length(); i ++) {
            char ch = pattern.charAt(i);
            if (map.containsKey(ch)) {
                String V = map.get(ch);
                if (!V.equals(tokens[i])) {
                    return false;
                }
            } else {
                map.put(ch, tokens[i]);
            }    
        }
        
         for (int i=0; i < pattern.length(); i ++) {
            // char ch = pattern.charAt(i);
             String s = tokens[i];
            
            if (revmap.containsKey(s)) {
                // String V = map.get(ch);
                char V = revmap.get(s);
                if (V != (pattern.charAt(i))) {
                    return false;
                }
            } else {
                revmap.put(s, pattern.charAt(i));
            }    
        }
        
        
    
        
        return true;
    }
}