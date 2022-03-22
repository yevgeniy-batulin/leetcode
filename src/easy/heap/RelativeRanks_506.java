package easy.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class RelativeRanks_506 {
	public String[] findRelativeRanks(int[] score) {
		Map<Integer, Integer> mapping = new HashMap<>();
		Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		for (int index = 0; index < score.length; index++) {
			mapping.put(score[index], index);
			maxHeap.offer(score[index]);
		}

		String[] ranks = new String[score.length];
		int rank = 1;
		while (!maxHeap.isEmpty()) {
			int index = mapping.get(maxHeap.poll());
			ranks[index] = getRank(rank);
			rank++;
		}
		return ranks;
	}

	private String getRank(int rank) {
		switch (rank) {
			case 1:
				return "Gold Medal";
			case 2:
				return "Silver Medal";
			case 3:
				return "Bronze Medal";
			default:
				return String.valueOf(rank);
		}
	}
}
