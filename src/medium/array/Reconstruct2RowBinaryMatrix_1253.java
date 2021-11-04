package medium.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reconstruct2RowBinaryMatrix_1253 {
	public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colSum) {
		int sum = 0;
		for (int it : colSum) {
			sum += it;
		}
		if (upper + lower != sum) {
			return Collections.emptyList();
		}

		List<List<Integer>> matrix = new ArrayList<>(2);
		final List<Integer> upperRow = getRow(upper, colSum);
		if (upperRow.isEmpty()) return Collections.emptyList();
		matrix.add(upperRow);
		final List<Integer> lowerRow = getRow(lower, colSum);
		if (lowerRow.isEmpty()) return Collections.emptyList();
		matrix.add(lowerRow);
		return matrix;
	}

	private List<Integer> getRow(int rowSum, int[] colSum) {
		List<Integer> row = new ArrayList<>(colSum.length);
		for (int i = 0; i < colSum.length; i++) {
			row.add(0);
		}
		for (int i = 0; i < colSum.length; i++) {
			if (colSum[i] == 2) {
				row.set(i, 1);
				rowSum--;
			}
		}
		for (int i = 0; i < colSum.length; i++) {
			if (rowSum > 0 && colSum[i] == 1) {
				row.set(i, 1);
				rowSum--;
				colSum[i]--;
			}
		}
		if (rowSum > 0) {
			return Collections.emptyList();
		} else {
			return row;
		}
	}
}
