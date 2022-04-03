package medium.greedy;

public class MinimizeProductSumOfTwoArrays_1874 {
	public int minProductSum(int[] nums1, int[] nums2) {
		int[] nums1Count = new int[101];
		int[] nums2Count = new int[101];
		for (int index = 0; index < nums1.length; index++) {
			nums1Count[nums1[index]]++;
			nums2Count[nums2[index]]++;
		}

		int product = 1;
		int left = 1;
		int right = 100;
		while (left < 101 && right > 0) {
			while (left < 101 && nums1Count[left] == 0) {
				left++;
			}

			while (right > 0 && nums2Count[right] == 0) {
				right--;
			}

			if (left < 101) {
				int count = Math.min(nums1Count[left], nums2Count[right]);
				product *= count * left * right;
				nums1Count[left] -= count;
				nums2Count[right] -= count;
			}
		}

		return product;
	}
}
