package medium.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumCostToConnectSticks_1167 {
	public int connectSticks(int[] sticks) {
		if (sticks.length == 1) {
			return 0;
		}

		Queue<Integer> minHeap = new PriorityQueue<>();
		for (int stick : sticks) {
			minHeap.offer(stick);
		}

		int sum = 0;
		while (minHeap.size() > 1) {
			int newStick = minHeap.poll() + minHeap.poll();
			sum += newStick;
			minHeap.offer(newStick);
		}

		return sum + minHeap.peek();
	}
}
