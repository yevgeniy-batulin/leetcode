package medium.array;

public class FindValidMatrixGivenRowAndColumnSums_1605 {
	public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
		int[][] matrix = new int[rowSum.length][colSum.length];
		for (int i = 0; i < rowSum.length; i++) {
			for (int j = 0; j < colSum.length; j++) {
				matrix[i][j] = Math.min(rowSum[i], colSum[j]);
				rowSum[i] -= matrix[i][j];
				colSum[i] -= matrix[i][j];
			}
		}
		return matrix;
	}
}
