package easy.math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers_728 {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> numbers = new ArrayList<>();
		for (; left <= right; left++) {
			if (selfDividing(left)) numbers.add(left);
		}
		return numbers;
	}

	private boolean selfDividing(int left) {
		int divider = 1;
		while (left / divider > 0) {
			int digit = (left / divider) % 10;
			if (digit == 0 || left % digit != 0) {
				return false;
			}
			divider *= 10;
		}
		return true;
	}
}
