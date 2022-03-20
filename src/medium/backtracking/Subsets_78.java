package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> subsets = new ArrayList<>();
		helper(nums, 0, new ArrayList<>(), subsets);
		return subsets;
	}

	private void helper(int[] nums, int index, List<Integer> subset, List<List<Integer>> subsets) {
		if (index == nums.length) {
			subsets.add(subset);
			return;
		}

		helper(nums, index + 1, new ArrayList<>(subset), subsets);
		subset.add(nums[index]);
		helper(nums, index + 1, new ArrayList<>(subset), subsets);
	}
}
