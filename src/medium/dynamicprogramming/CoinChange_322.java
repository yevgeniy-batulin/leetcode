package medium.dynamicprogramming;

// https://leetcode.com/problems/coin-change/
class CoinChange_322 {
    public int coinChange(int[] coins, int amount) {
        int[] minimumNumberOfCoins = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            minimumNumberOfCoins[i] = amount + 1;
            for (int coin : coins) {
                if (i >= coin) {
                    minimumNumberOfCoins[i] = Math.min(minimumNumberOfCoins[i], minimumNumberOfCoins[i - coin] + 1);
                }
            }
        }
        return minimumNumberOfCoins[amount] > amount ? -1 : minimumNumberOfCoins[amount];
    }
}