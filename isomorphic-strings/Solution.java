public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
		if (s.length() != t.length())
			return false;

		String sCopy = s;

		Map<Character, Character> charMap = new HashMap<Character, Character>();
		Map<Character, Character> charMap2 = new HashMap<Character, Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			char value = t.charAt(i);
			// System.out.println("key:" + key + " | val:" + value);
			if (!charMap.containsKey(key)) {
				charMap.put(key, value);
			} else {
				if (charMap.get(key) != value)
					return false;
			}
		}
		
		
		for (int i = 0; i < s.length(); i++) {
			char key = t.charAt(i);
			char value = s.charAt(i);
			
			 if (!charMap2.containsKey(key)) {
				charMap2.put(key, value);
			} else {
				if (charMap2.get(key) != value)
					return false;
			}
		}
		
		if (charMap.size() != charMap2.size())
			return false;
		else return true;
    }
}