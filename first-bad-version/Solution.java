/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

// i think git has something like this called git bisect.

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

		if (n == 1) return n;
		int lo = 1;
		int hi = n;
		int mid = -1;
		 
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			if (isBadVersion(mid)) {
				hi = mid - 1;				
			} else {
				lo = mid + 1;
			}
		}		
		
		 while (mid > 0 && isBadVersion(mid))
			mid--;

		 return (mid + 1);		
        
    }
}