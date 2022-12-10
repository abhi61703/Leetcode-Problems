class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) 
            return 0;
        
        int minStockPrice = prices[0];
        int bestDeal = 0;
        
        
        for (int i = 0; i < prices.length; i++) {
            minStockPrice = Math.min(prices[i], minStockPrice);
            bestDeal = Math.max(prices[i] - minStockPrice, bestDeal);
        }
        
        return bestDeal;
    }
}
