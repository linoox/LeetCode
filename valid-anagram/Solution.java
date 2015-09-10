public class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (charCountMap.containsKey(ch)) {
				int count = charCountMap.get(ch);
				charCountMap.put(ch, count + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}
				

		for (int i = 0; i < t.length(); i++) {
			Character ch = t.charAt(i);
			if (charCountMap.containsKey(ch)) {
				int count = charCountMap.get(ch);				
				if ((count-1) < 0)
					return false;
				charCountMap.put(ch, count - 1);				
			} else {
				return false;
			}
		}

		return true;
    }
}