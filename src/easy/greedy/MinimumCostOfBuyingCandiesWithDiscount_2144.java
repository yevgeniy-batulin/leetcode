package easy.greedy;

import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount_2144 {
	public int minimumCost(int[] cost) {
		Arrays.sort(cost);
		int minCost = 0;
		for (int index = cost.length - 1; index >= 0; index--) {
			if (index % 3 != cost.length % 3) {
				minCost += cost[index];
			}
		}
		return minCost;
	}

	public static void main(String[] args) {
		System.out.println(new MinimumCostOfBuyingCandiesWithDiscount_2144().minimumCost(new int[]{6, 5, 7, 9, 2, 2}));
	}
}
