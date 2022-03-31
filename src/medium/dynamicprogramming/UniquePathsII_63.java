package medium.dynamicprogramming;

import java.util.Arrays;

public class UniquePathsII_63 {
	private int[][] memo;
	private int[][] grid;

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		memo = new int[obstacleGrid.length][obstacleGrid[0].length];
		for (int[] array : memo) {
			Arrays.fill(array, -1);
		}
		grid = obstacleGrid;
		return paths(0, 0);
	}

	private int paths(int row, int col) {
		if (row >= memo.length || col >= memo[0].length || grid[row][col] == 1) {
			return 0;
		}
		if (row == memo.length - 1 && col == memo[0].length - 1) {
			return 1;
		}

		if (memo[row][col] == -1) {
			memo[row][col] = paths(row + 1, col) + paths(row, col + 1);
		}
		return memo[row][col];
	}
}
