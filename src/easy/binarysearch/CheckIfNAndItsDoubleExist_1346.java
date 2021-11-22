package easy.binarysearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist_1346 {
	public boolean checkIfExistLinear(int[] array) {
		Set<Integer> set = new HashSet<>();
		for (int number: array) {
			if (set.contains(number * 2) || number % 2 == 0 && set.contains(number / 2)) {
				return true;
			}
			set.add(number);
		}
		return false;
	}

	public boolean checkIfExistLogarithmic(int[] array) {
		if (containsMoreThanTwoZeros(array)) {
			return true;
		}

		Arrays.sort(array);
		for (int index = 0; index < array.length; index++) {
			int search = search(array, array[index] * 2);
			if (search >= 0 && index != search) {
				return true;
			}
		}
		return false;
	}

	private boolean containsMoreThanTwoZeros(int[] array) {
		boolean seen = false;
		for (int number : array) {
			if (number == 0) {
				if (seen) {
					return true;
				} else {
					seen = true;
				}
			}
		}
		return false;
	}

	private int search(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (array[mid] < target) {
				low = mid + 1;
			} else if (array[mid] > target) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
