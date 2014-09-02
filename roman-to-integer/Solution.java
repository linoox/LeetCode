public class Solution {
    public int romanToInt(String s) {
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
}