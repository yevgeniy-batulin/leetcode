package medium.dynamicprogramming;

public class HouseRobberII_213 {
	public int rob(int[] nums) {
		if (nums.length < 2) {
			return nums[0];
		}

		return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
	}

	private int rob(int[] nums, int start, int end) {
		int robNext = nums[end];
		int robNextNext = 0;

		for (int index = end - 1; index >= start; index--) {
			int robCurrent = Math.max(nums[index] + robNextNext, robNext);
			robNextNext = robNext;
			robNext = robCurrent;
		}

		return robNext;
	}
}
