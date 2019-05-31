/*
	Coin Change
	
	You are given coins of different denominations and a total amount of money amount. 		Write a function to compute the fewest number of coins that you need to make up 	that amount. If that amount of money cannot be made up by any combination of the 		coins, return -1.
*/
class CoinChange {
    public int getCoinChange(int[] coins, int amount) {
        int max = amount + 1;             
        int[] dp = new int[amount + 1];  
        
        Arrays.fill(dp, max);  
        dp[0] = 0;   
        
        for (int c:coins) {
            for (int i = c; i < dp.length; i++) {
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);
                
             
            }
            for(int j:dp)
                    System.out.printf("%d ",j);
            System.out.printf("\n");
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
