package easy.array;

public class MaximumSubarray_53 {
	public int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];
		for (int index = 1; index < nums.length; index++) {
			currentSum = Math.max(currentSum + nums[index], nums[index]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}
}
