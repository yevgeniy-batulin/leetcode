package medium.array;

import java.util.Arrays;

public class SortTheMatrixDiagonally_1329 {
	public int[][] diagonalSort(int[][] mat) {
		int[] count = new int[101];
		int rows = mat.length;
		int cols = mat[0].length;

		for (int col = 0; col < cols - 1; col++) {
			Arrays.fill(count, 0);
			for (int index = 0; index < rows && index + col < cols; index++) {
				count[mat[index][index + col]]++;
			}

			int index = 0;
			for (int num = 1; num < count.length; num++) {
				while (count[num] > 0) {
					mat[index][index + col] = num;
					index++;
					count[num]--;
				}
			}
		}

		for (int row = 1; row < rows - 1; row++) {
			Arrays.fill(count, 0);
			for (int index = 0; index + row < rows && index < cols; index++) {
				count[mat[index + row][index]]++;
			}

			int index = 0;
			for (int num = 1; num < count.length; num++) {
				while (count[num] > 0) {
					mat[index + row][index] = num;
					index++;
					count[num]--;
				}
			}
		}

		return mat;
	}
}
