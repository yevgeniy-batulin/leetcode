package easy.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInStream_703 {
	class KthLargest {
		private final Queue<Integer> minHeap;
		private final int k;

		public KthLargest(int k, int[] nums) {
			this.k = k;
			this.minHeap = new PriorityQueue<>();
			for (int num : nums) {
				add(num);
			}
		}

		public int add(int val) {
			minHeap.offer(val);

			while (minHeap.size() > k) {
				minHeap.poll();
			}

			return minHeap.peek();
		}
	}
}
