package easy.array;

class BestTimeToBuyAndSellStock_121 {
	public int maxProfit(int[] prices) {
		if (prices.length < 2) {
			return 0;
		}

		int buy = prices[0];
		int profit = 0;
		for (int index = 1; index < prices.length; index++) {
			buy = Math.min(buy, prices[index]);
			profit = Math.max(profit, prices[index] - buy);
		}
		return profit;
	}
}
