public class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices.length < 1) return 0;
        
        if (prices.length == 1) return 0;
        
        int lo = prices[0];
        int profit = (prices[1]-lo > 0) ? (prices[1]-lo) : 0 ;
        for (int i=1; i < prices.length; i ++) {
            lo = Math.min(lo, prices[i]);
            profit = Math.max(profit, prices[i]-lo);
        }
        
        return profit;
    }
}