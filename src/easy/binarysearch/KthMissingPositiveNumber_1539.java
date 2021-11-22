package easy.binarysearch;

public class KthMissingPositiveNumber_1539 {
	public int findKthPositive(int[] array, int k) {
		int low = 0;
		int high = array.length;
		while (low < high) {
			int mid = low + (high - low) / 2;
			int difference = array[mid] - mid - 1;
			if (difference < k) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}

		return low + k;
	}
}
