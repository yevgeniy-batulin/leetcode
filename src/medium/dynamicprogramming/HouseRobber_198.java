package medium.dynamicprogramming;

class HouseRobber_198 {
	public int rob(int[] nums) {
		if (nums.length < 2) {
			return nums[0];
		}

		int robNext = nums[nums.length - 1];
		int robNextNext = 0;
		for (int index = nums.length - 2; index >= 0; index--) {
			int robCurrent = Math.max(nums[index] + robNextNext, robNext);
			robNextNext = robNext;
			robNext = robCurrent;
		}

		return robNext;
	}
}
