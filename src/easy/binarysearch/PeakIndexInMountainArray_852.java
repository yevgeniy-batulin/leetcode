package easy.binarysearch;

public class PeakIndexInMountainArray_852 {
	public int peakIndexInMountainArray(int[] array) {
		int low = 0;
		int high = array.length;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (array[mid] > array[mid - 1] && array[mid] > array[mid + 1]) {
				return mid;
			}

			if (array[mid] < array[mid + 1]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return -1;
	}
}
