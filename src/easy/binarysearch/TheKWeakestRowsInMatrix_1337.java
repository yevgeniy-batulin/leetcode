package easy.binarysearch;

import java.util.List;
import java.util.PriorityQueue;

public class TheKWeakestRowsInMatrix_1337 {
	public int[] kWeakestRows(int[][] matrix, int k) {
		PriorityQueue<List<Integer>> maxHeap = new PriorityQueue<>((firstRow, secondRow) -> {
			int diff = secondRow.get(1) - firstRow.get(1);
			return diff == 0 ? secondRow.get(0) - firstRow.get(0) : diff;
		});

		for (int index = 0; index < matrix.length; index++) {
			List<Integer> indexToCount = List.of(index, getSoldiersCount(matrix[index]));
			maxHeap.offer(indexToCount);
			if (maxHeap.size() > k) {
				maxHeap.poll();
			}
		}

		int[] result = new int[k];
		while (k > 0) {
			result[--k] = maxHeap.poll().get(0);
		}
		return result;
	}

	private int getSoldiersCount(int[] row) {
		int low = 0;
		int high = row.length;
		while (low < high) {
			int mid = low + (high - low) / 2;

			if (row[mid] == 1) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		new TheKWeakestRowsInMatrix_1337().kWeakestRows(
				new int[][]{{1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1}},
				4);
	}
}
