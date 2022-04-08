package easy.array;

public class Convert1dArrayInto2dArray_2022 {
	public int[][] construct2DArray(int[] original, int m, int n) {
		if (m * n != original.length) {
			return new int[0][0];
		}

		int[][] matrix = new int[m][n];
		for (int row = 0; row < m; row++) {
			for (int col = 0; col < n; col++) {
				matrix[row][col] = original[n * row + col];
			}
		}
		return matrix;
	}
}
