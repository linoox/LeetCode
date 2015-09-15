public class Solution {
      public static boolean isHappy(int n) {
   int sum=0;
   Set<Integer> seenSet = new HashSet<Integer>();
		while (n > 0) {
			int x = n%10;
			sum+=x*x;
			// n=n/10;
			n/=10; // seems this change makes the code much faster
			
			if (n == 0 && sum != 1) {
				n=sum;
				sum=0;
				seenSet.add(n);
			} else if (n== 0 && sum == 1 ) {
				return true;
			}
				else if (seenSet.contains(n)) {
				return false;
			}
		}
		
		return true;
   }
}