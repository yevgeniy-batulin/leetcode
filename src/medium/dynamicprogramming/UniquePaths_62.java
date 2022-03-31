package medium.dynamicprogramming;

import java.util.Arrays;

public class UniquePaths_62 {
	public int uniquePathsBottomUp(int m, int n) {
		int[][] dp = new int[m][n];
		for (int index = 0; index < m; index++) {
			Arrays.fill(dp[index], 1);
		}
		for (int row = 1; row < m; row++) {
			for (int col = 1; col < n; col++) {
				dp[row][col] = dp[row - 1][col] + dp[row][col - 1];
			}
		}
		return dp[m - 1][n - 1];
	}


	private int[][] memo;

	public int uniquePathsTopDown(int m, int n) {
		memo = new int[m][n];
		for (int index = 0; index < m; index++) {
			Arrays.fill(memo[index], -1);
		}
		return paths(0, 0);
	}

	private int paths(int row, int column) {
		if (row >= memo.length || column >= memo[0].length) {
			return 0;
		}
		if (row == memo.length - 1 && column == memo[0].length - 1) {
			return 1;
		}

		if (memo[row][column] == -1) {
			memo[row][column] = paths(row + 1, column) + paths(row, column + 1);
		}
		return memo[row][column];
	}
}
