class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for(int i=1;i<n;i++)
        {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}