package medium.binarysearch;

public class SingleElementInSortedArray_540 {
	public int singleNonDuplicate(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			boolean evenIndex = mid % 2 == 0;
			if ((mid < nums.length - 1 && nums[mid] == nums[mid + 1] && !evenIndex)
					|| (mid > 0 && nums[mid] == nums[mid - 1] && evenIndex)) {
				high = mid - 1;
			} else if ((mid < nums.length - 1 && nums[mid] == nums[mid + 1] && evenIndex)
					|| (mid > 0 && nums[mid] == nums[mid - 1] && !evenIndex)) {
				low = mid + 1;
			} else {
				return nums[mid];
			}
		}
		return -1;
	}

	public int singleNonDuplicateAlternative(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == nums[mid + 1]) {
				mid--;
			}

			if ((mid - low + 1) % 2 != 0) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return nums[low];
	}
}
