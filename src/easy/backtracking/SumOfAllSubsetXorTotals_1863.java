package easy.backtracking;

public class SumOfAllSubsetXorTotals_1863 {
	public int subsetXORSum(int[] nums) {
		return helper(nums, 0, 0);
	}

	private int helper(int[] nums, int index, int xor) {
		if (index >= nums.length) {
			return xor;
		}

		return helper(nums, index + 1, xor ^ nums[index]) + helper(nums, index + 1, xor);
	}

	public static void main(String[] args) {
		System.out.println(new SumOfAllSubsetXorTotals_1863().subsetXORSum(new int[]{5, 1, 6}));
	}
}
