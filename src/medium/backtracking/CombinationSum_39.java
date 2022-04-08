package medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_39 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> combinations = new ArrayList<>();
		helper(candidates, 0, target, new ArrayList<>(), combinations);
		return combinations;
	}

	private void helper(int[] candidates, int start, int target, List<Integer> combination, List<List<Integer>> combinations) {
		if (target == 0) {
			combinations.add(new ArrayList<>(combination));
			return;
		}
		if (target < 0) {
			return;
		}

		for (int index = start; index < candidates.length; index++) {
			combination.add(candidates[index]);
			int newTarget = target - candidates[index];
			helper(candidates, index, newTarget, combination, combinations);
			combination.remove(combination.size() - 1);
		}
	}
}
