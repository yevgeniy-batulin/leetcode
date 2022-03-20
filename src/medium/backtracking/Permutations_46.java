package medium.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations_46 {
	public List<List<Integer>> permute(int[] nums) {
		List<Integer> numbers = new ArrayList<>();
		for (int num : nums) {
			numbers.add(num);
		}
		List<List<Integer>> permutations = new ArrayList<>();
		helper(numbers, 0, permutations);
		return permutations;
	}

	private void helper(List<Integer> numbers, int start, List<List<Integer>> permutations) {
		if (start == numbers.size()) {
			permutations.add(new ArrayList<>(numbers));
			return;
		}

		for (int index = start; index < numbers.size(); index++) {
			Collections.swap(numbers, index, start);

			helper(numbers, start + 1, permutations);

			Collections.swap(numbers, index, start);
		}
	}

	public static void main(String[] args) {
		System.out.println(new Permutations_46().permute(new int[]{1, 2, 3}));
	}
}
