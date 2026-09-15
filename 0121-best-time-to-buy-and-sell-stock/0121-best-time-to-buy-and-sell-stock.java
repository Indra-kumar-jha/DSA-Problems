class Solution {
    public int maxProfit(int[] prices) {
        int minPrices = prices[0];
        int maxProfit = 0;
        for(int price:prices){
            if(price < minPrices){
                minPrices = price;
            }
            else{
                if(maxProfit < price-minPrices){
                    maxProfit = price-minPrices;
                }
            }
        }
        return maxProfit;
    }
}