package medium.dynamicprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeleteAndEarn_740 {
	private Map<Integer, Integer> points = new HashMap<>();

	public int deleteAndEarn(int[] nums) {
		int maxNumber = 0;
		for (int num : nums) {
			maxNumber = Math.max(maxNumber, num);
			points.put(num, points.getOrDefault(num, 0) + num);
		}

		int prevScore = 0;
		int prevPrevScore = 0;
		for (int number = 0; number <= maxNumber; number++) {
			int currentScore = Math.max(points.getOrDefault(number, 0) + prevPrevScore, prevScore);
			prevPrevScore = prevScore;
			prevScore = currentScore;
		}

		return prevScore;
	}

	public int deleteAndEarnWithKeysSort(int[] nums) {
		for (int num : nums) {
			points.put(num, points.getOrDefault(num, 0) + num);
		}

		List<Integer> keys = new ArrayList<>(points.keySet());
		Collections.sort(keys);

		int prevScore = points.get(keys.get(0));
		int prevPrevScore = 0;
		for (int index = 1; index < keys.size(); index++) {
			int key = keys.get(index);
			int currentScore;
			if (key == keys.get(index - 1) + 1) {
				currentScore = Math.max(points.get(key) + prevPrevScore, prevScore);
			} else {
				currentScore = points.get(key) + prevScore;
			}
			prevPrevScore = prevScore;
			prevScore = currentScore;
		}

		return prevScore;
	}


	private Map<Integer, Integer> memo = new HashMap<>();

	public int deleteAndEarnTopDown(int[] nums) {
		int maxNumber = 0;
		for (int num : nums) {
			maxNumber = Math.max(maxNumber, num);
			points.put(num, points.getOrDefault(num, 0) + num);
		}

		return getMaxPoints(maxNumber);
	}

	private int getMaxPoints(int number) {
		if (number <= 0) {
			return 0;
		}

		if (!memo.containsKey(number)) {
			int score = Math.max(points.getOrDefault(number, 0) + getMaxPoints(number - 2), getMaxPoints(number - 1));
			memo.put(number, score);
		}
		return memo.get(number);
	}
}
