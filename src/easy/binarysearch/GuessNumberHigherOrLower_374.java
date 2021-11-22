package easy.binarysearch;

import java.util.PriorityQueue;

public class GuessNumberHigherOrLower_374 {
	public int guessNumber(int n) {
		int low = 1;
		int high = n;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int guess = guess(mid);
			if (guess == 1) {
				low = mid + 1;
			} else if (guess == -1) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return 0;
	}

	private int guess(int num) {
		// implementation is provided
		return 0;
	}
}
