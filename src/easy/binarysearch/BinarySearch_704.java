package easy.binarysearch;

public class BinarySearch_704 {
	public int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] > target) {
				high = mid;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
