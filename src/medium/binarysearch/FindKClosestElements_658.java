package medium.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FindKClosestElements_658 {
	public List<Integer> findClosestElements(int[] array, int k, int x) {
		int low = 0;
		int high = array.length - k;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (x - array[mid] > array[mid + k] - x) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}

		List<Integer> closest = new ArrayList<>(k);
		for (int index = low; index < low + k; index++) {
			closest.add(array[index]);
		}
		return closest;
	}

	public List<Integer> findClosestElementsPriorityQueue(int[] array, int k, int x) {
		PriorityQueue<Integer> queue = new PriorityQueue<>((number1, number2) -> {
			int diff = Math.abs(number2 - x) - Math.abs(number1 - x);
			return diff == 0 ? number2 - number1 : diff;
		});

		for (int number : array) {
			queue.offer(number);
			if (queue.size() > k) {
				queue.poll();
			}
		}

		List<Integer> closest = new ArrayList<>();
		while (!queue.isEmpty()) {
			closest.add(queue.poll());
		}
		Collections.sort(closest);
		return closest;
	}

	public static void main(String[] args) {
		System.out.println(new FindKClosestElements_658().findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, -1));
	}
}
