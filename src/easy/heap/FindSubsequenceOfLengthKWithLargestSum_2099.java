package easy.heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindSubsequenceOfLengthKWithLargestSum_2099 {
	public int[] maxSubsequence(int[] nums, int k) {
		Queue<Integer> minHeap = new PriorityQueue<>((first, second) -> nums[first] - nums[second]);
		for (int index = 0; index < nums.length; index++) {
			minHeap.offer(index);
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}

		int[] result = new int[k];
		for (int index = 0; index < result.length; index++) {
			result[index] = minHeap.poll();
		}
		Arrays.sort(result);
		for (int index = 0; index < result.length; index++) {
			result[index] = nums[result[index]];
		}
		return result;
	}
}
