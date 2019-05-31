/*
	Coin Change 2
	
	You are given coins of different denominations and a total amount of money. 
	Write a function to compute the number of combinations that make up that amount. 		You may assume that you have infinite number of each kind of coin.

*/

class CoinChange2 {
    public int change(int amount, int[] coins) {
        int[] combinations = new int[amount + 1];
        
        combinations[0] = 1;
        
        /*
            combinations[i-c] -> given an amount and a coin value, if we take the difference, how many more ways can that difference be computed with the given coins
        */
        for(int c : coins) {
            for(int i = c; i < combinations.length; i++) {
                combinations[i] = combinations[i] + combinations[i - c];   
            }
        }
        
        
        return combinations[amount];
    }
}


