package easy.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrder_1403 {
	public List<Integer> minSubsequence(int[] nums) {
		Arrays.sort(nums);
		int notIncludedSum = 0;
		for (int num : nums) {
			notIncludedSum += num;
		}

		List<Integer> minSubsequence = new ArrayList<>();
		for (int includedSum = 0, index = nums.length - 1; includedSum <= notIncludedSum; index--) {
			minSubsequence.add(nums[index]);
			includedSum += nums[index];
			notIncludedSum -= nums[index];
		}
		return minSubsequence;
	}
}
