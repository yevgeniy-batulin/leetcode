package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> subsets = new ArrayList<>();
		generate(nums, 0, new ArrayList<>(), subsets);
		return subsets;
	}

	private void generate(int[] nums, int currentIndex, List<Integer> subset, List<List<Integer>> subsets) {
		subsets.add(new ArrayList<>(subset));

		for (int index = currentIndex; index < nums.length; index++) {
			subset.add(nums[index]);
			generate(nums, index + 1, subset, subsets);
			subset.remove(subset.size() - 1);
		}
	}
}
