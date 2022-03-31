package medium.dynamicprogramming;

public class MaximumProductSubarray_152 {
	public int maxProduct(int[] nums) {
		int maxProduct = nums[0];
		int maxCurrentProduct = nums[0];
		int minCurrentProduct = nums[0];

		for (int index = 1; index < nums.length; index++) {
			int num = nums[index];
			int temp = Math.max(num, Math.max(maxCurrentProduct * num, minCurrentProduct * num));
			minCurrentProduct = Math.min(num, Math.min(maxCurrentProduct * minCurrentProduct, minCurrentProduct * num));
			maxCurrentProduct = temp;
			maxProduct = Math.max(maxProduct, maxCurrentProduct);
		}

		return maxProduct;
	}
}
