package medium.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInArray_215 {
	public int findKthLargest(int[] nums, int k) {
		Queue<Integer> minHeap = new PriorityQueue<>();
		for (int num : nums) {
			minHeap.offer(num);
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}

		return minHeap.peek();
	}
}
