package easy.array;

public class RangeSumQueryImmutable_303 {
	static class NumArray {
		private final int[] prefixSum;

		public NumArray(int[] nums) {
			prefixSum = new int[nums.length + 1];
			for (int index = 0; index < nums.length; index++) {
				prefixSum[index + 1] = prefixSum[index] + nums[index];
			}
		}

		public int sumRange(int left, int right) {
			return prefixSum[right] - prefixSum[left];
		}
	}
}
