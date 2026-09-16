class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int j= 1;j<prices.length;j++){
            if(prices[j]>prices[j-1]){
                 maxProfit += prices[j] - prices[j-1];
            }
        }
        return maxProfit;
    }
}