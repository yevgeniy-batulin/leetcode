package easy.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FloodFill_733 {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int rows = image.length;
		int cols = image[0].length;
		int oldColor = image[sr][sc];
		int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		Queue<List<Integer>> q = new LinkedList<>();
		q.offer(List.of(sr, sc));

		while (!q.isEmpty()) {
			List<Integer> coordinates = q.poll();
			int row = coordinates.get(0);
			int col = coordinates.get(1);
			image[row][col] = newColor;

			for (int[] direction : directions) {
				int neighbourRow = row + direction[0];
				int neighbourCol = col + direction[1];
				if (neighbourRow >= 0 && neighbourRow < rows && neighbourCol >= 0 && neighbourCol < cols
						&& image[neighbourRow][neighbourCol] == oldColor) {
					q.offer(List.of(neighbourRow, neighbourCol));
				}
			}
		}

		return image;
	}
}
