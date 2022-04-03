package medium.graph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class NumberOfIslands_200 {
	private static final int[][] DIR = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

	public int numIslands(char[][] grid) {
		int islands = 0;
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		Deque<List<Integer>> stack = new ArrayDeque<>();
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if (grid[row][col] == '1' && !visited[row][col]) {
					islands++;
					stack.push(List.of(row, col));
					dfs(grid, stack, visited);
				}
			}
		}
		return islands;
	}

	private void dfs(char[][] grid, Deque<List<Integer>> stack, boolean[][] visited) {
		while (!stack.isEmpty()) {
			List<Integer> coordinates = stack.pop();
			visited[coordinates.get(0)][coordinates.get(1)] = true;
			for (int[] direction : DIR) {
				int row = coordinates.get(0) + direction[0];
				int col = coordinates.get(1) + direction[1];
				if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length
						&& grid[row][col] == '1' && !visited[row][col]) {
					stack.push(List.of(row, col));
				}
			}
		}
	}
}
