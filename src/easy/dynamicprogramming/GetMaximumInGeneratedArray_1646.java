package easy.dynamicprogramming;

public class GetMaximumInGeneratedArray_1646 {
	public int getMaximumGenerated(int n) {
		if (n == 0) {
			return 0;
		}
		int[] dp = new int[n + 1];
		dp[1] = 1;
		int max = 1;
		for (int index = 1; index <= n / 2; index++) {
			dp[2 * index] = dp[index];
			if (2 * index + 1 <= n) {
				dp[2 * index + 1] = dp[index] + dp[index + 1];
				max = Math.max(max, dp[2 * index + 1]);
			}
		}
		return max;
	}
}
