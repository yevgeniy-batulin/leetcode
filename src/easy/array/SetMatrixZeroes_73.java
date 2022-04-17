package easy.array;

import java.util.Arrays;

public class SetMatrixZeroes_73 {
	public void setZeroes(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		boolean firstColumn = false;

		for (int row = 0; row < rows; row++) {
			if (matrix[row][0] == 0) {
				firstColumn = true;
			}

			for (int col = 1; col < cols; col++) {
				if (matrix[row][col] == 0) {
					matrix[row][0] = 0;
					matrix[0][col] = 0;
				}
			}
		}

		for (int row = 1; row < rows; row++) {
			for (int col = 1; col < cols; col++) {
				if (matrix[0][col] == 0 || matrix[row][0] == 0) {
					matrix[row][col] = 0;
				}
			}
		}

		if (matrix[0][0] == 0) {
			Arrays.fill(matrix[0], 0);
		}

		if (firstColumn) {
			for (int row = 0; row < rows; row++) {
				matrix[row][0] = 0;
			}
		}
	}
}
