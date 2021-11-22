package easy.binarysearch;

import java.util.BitSet;

public class ValidPerfectSquare_367 {
	public boolean isPerfectSquare(int number) {
		if (number == 1) return true;

		int low = 1;
		int high = number / 2;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			long square = (long) mid * mid;
			if (square > number) {
				high = mid - 1;
			} else if (square < number) {
				low = mid + 1;
			} else {
				return true;
			}
		}
		return false;
	}
}
