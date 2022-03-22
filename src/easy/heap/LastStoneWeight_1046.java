package easy.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight_1046 {
	public int lastStoneWeight(int[] stones) {
		Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		for(int stone : stones) {
			maxHeap.offer(stone);
		}

		while(maxHeap.size() > 1) {
			Integer firstStone = maxHeap.poll();
			Integer secondStone = maxHeap.poll();

			int diff = firstStone - secondStone;
			if(diff > 0) {
				maxHeap.offer(diff);
			}
		}

		return maxHeap.isEmpty() ? 0 : maxHeap.poll();
	}
}
