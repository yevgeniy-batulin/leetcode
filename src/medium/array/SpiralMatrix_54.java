package medium.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
	public List<Integer> spiralOrderAlternative(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		List<Integer> numbers = new ArrayList<>();
		int up = 0;
		int left = 0;
		int right = cols - 1;
		int down = rows - 1;

		while (numbers.size() < rows * cols) {
			for (int index = up; index <= right; index++) {
				numbers.add(matrix[up][index]);
			}

			for (int index = up + 1; index <= down; index++) {
				numbers.add(matrix[index][right]);
			}

			if (up < down) {
				for (int index = right - 1; index >= left; index--) {
					numbers.add(matrix[down][index]);
				}
			}

			if (left < right) {
				for (int index = down - 1; index > up; index--) {
					numbers.add(matrix[index][left]);
				}
			}

			up++;
			left++;
			right--;
			down--;
		}

		return numbers;
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		List<Integer> numbers = new ArrayList<>();
		int layers = (int) Math.ceil(Math.min(matrix.length, matrix[0].length) / 2.0);

		for (int layer = 0; layer < layers; layer++) {
			for (int index = layer; index < cols - layer; index++) {
				numbers.add(matrix[layer][index]);
			}

			for (int index = layer + 1; index < rows - layer; index++) {
				numbers.add(matrix[index][cols - layer - 1]);
			}

			if (rows - layer > layer + 1) {
				for (int index = cols - layer - 2; index >= layer; index--) {
					numbers.add(matrix[rows - layer - 1][index]);
				}
			}

			if (cols - layer > layer + 1) {
				for (int index = rows - layer - 2; index > layer; index--) {
					numbers.add(matrix[index][layer]);
				}
			}
		}

		return numbers;
	}
}
