package easy.math;

public class CellsWithOddValuesInMatrix_1252 {
	public int oddCells(int m, int n, int[][] indices) {
		boolean[][] matrix = new boolean[m][n];
		for (int i = 0; i < indices.length; i++) {
			for (int j = 0; j < n; j++) {
				matrix[indices[i][0]][j] = !matrix[indices[i][0]][j];
			}
			for (int j = 0; j < m; j++) {
				matrix[j][indices[i][1]] = !matrix[j][indices[i][1]];
			}
		}
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j])
					count++;
			}
		}
		return count;
	}
}
