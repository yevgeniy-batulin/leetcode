package easy.greedy;

import java.util.Arrays;

public class LargestSubarrayLengthK_1708 {
	public int[] largestSubarray(int[] nums, int k) {
		int maxIndex = 0;
		for (int index = 1; index <= nums.length - k; index++) {
			if (nums[index] > nums[maxIndex]) {
				maxIndex = index;
			}
		}


		return Arrays.copyOfRange(nums, maxIndex, maxIndex + k);
	}
}
