package easy.binarysearch;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanOrEqualX_1608 {
	public int specialArray(int[] numbers) {
		Arrays.sort(numbers);
		for (int number = 1; number <= numbers.length; number++) {
			int searchIndex = search(numbers, number);
			if ((searchIndex >= 0 && numbers.length - searchIndex == number)
					|| (searchIndex < 0 && numbers.length + searchIndex + 1 == number)) {
				return number;
			}
		}
		return -1;
	}

	private int search(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (array[mid] > target || (array[mid] == target && mid > 0 && array[mid] == array[mid - 1])) {
				high = mid - 1;
			} else if (array[mid] < target) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -(low + 1);
	}

	public static void main(String[] args) {
		System.out.println(new SpecialArrayWithXElementsGreaterThanOrEqualX_1608().search(new int[] {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100}, 100));
	}
}
