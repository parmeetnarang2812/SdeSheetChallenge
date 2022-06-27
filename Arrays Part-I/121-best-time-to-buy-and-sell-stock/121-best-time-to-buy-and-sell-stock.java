class Solution {
    public int maxProfit(int[] prices) {
        int minCost = prices[0];
        int maxProfit = 0;
        for(int price : prices) {
            if(price < minCost) {
                minCost = price;
            }
            maxProfit = Math.max(maxProfit, price - minCost);
        }
        return maxProfit;
    }
}