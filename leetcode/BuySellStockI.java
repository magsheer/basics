/*
    Say you have an array for which the ith element is the price of a given
    stock on day i.

    If you were only permitted to complete at most one transaction (i.e., buy one
    and sell one share of the stock), design an algorithm to find the maximum profit.

    Note that you cannot sell a stock before you buy one.

*/
class BuySellStockI {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;

        //keep track of the min price till now and the max profit gained
        int min = prices[0];
        int maxProfit = 0;
        
        for(int i = 1; i < prices.length; i++) {
            if(min > prices[i])
                min = prices[i];
            else if(prices[i] > min){
                int newProfit = prices[i] - min;
                if(newProfit > maxProfit)
                    maxProfit = newProfit;
            }
        }
        
        return maxProfit;
        
    }
}