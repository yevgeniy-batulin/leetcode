package medium.greedy;

public class MaximumDistanceBetweenPairOfValues_1855 {
	public int maxDistance(int[] nums1, int[] nums2) {
		int left = 0;
		int right = nums2.length - 1;
		while (left < nums1.length && right >= 0 && left <= right) {
			if (nums2[right] > nums1[left]) {
				return right - left;
			}

			int leftDiff = left < nums1.length - 1 ? nums1[left] - nums1[left + 1] : 0;
			int rightDiff = right > 0 ? nums2[right - 1] - nums2[right] : 0;
			if (leftDiff > rightDiff) {
				left++;
			} else {
				right--;
			}
		}
		return 0;
	}
}
