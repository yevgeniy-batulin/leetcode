package medium.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReduceArraySizeToTheHalf_1338 {
	public int minSetSize(int[] array) {
		Map<Integer, Integer> count = new HashMap<>();
		for (int number : array) {
			count.put(number, count.getOrDefault(number, 0) + 1);
		}

		Queue<Integer> maxHeap = new PriorityQueue<>((first, second) -> count.get(second) - count.get(first));
		for (Integer number : count.keySet()) {
			maxHeap.offer(number);
		}

		int elementsToRemove = array.length / 2;
		int elementsRemoved = 0;
		while (elementsToRemove > 0) {
			elementsToRemove -= count.get(maxHeap.poll());
			elementsRemoved++;
		}
		return elementsRemoved;
	}
}
