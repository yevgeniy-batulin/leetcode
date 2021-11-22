package medium.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class FindPositiveIntegerSolutionForGivenEquation_1237 {
	public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
		List<List<Integer>> solutions = new ArrayList<>();
		for (int x = 1; x < 1000; x++) {
			int low = 0;
			int high = 1000;
			while (low <= high) {
				int mid = low + (high - low) / 2;
				int result = customfunction.f(x, mid);
				if (result > z) {
					high = mid - 1;
				} else if (result < z) {
					low = mid + 1;
				} else {
					solutions.add(List.of(x, mid));
					break;
				}
			}
		}
		return solutions;
	}

	static class CustomFunction {
		// Returns f(x, y) for any given positive integers x and y.
		// Note that f(x, y) is increasing with respect to both x and y.
		// i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
		public int f(int x, int y) {
			return 0;
		}
	}
}
