package easy.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement_496 {
	public int[] nextGreaterElementWithArray(int[] nums1, int[] nums2) {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(nums2[nums2.length - 1]);
		int[] nextGreaterArray = new int[100000];
		nextGreaterArray[nums2[nums2.length - 1]] = -1;

		for (int index = nums2.length - 2; index >= 0; index--) {
			while (!stack.isEmpty() && nums2[index] > stack.peek()) {
				stack.pop();
			}

			if (!stack.isEmpty()) {
				nextGreaterArray[nums2[index]] = stack.peek();
			} else {
				nextGreaterArray[nums2[index]] = -1;
			}

			stack.push(nums2[index]);
		}

		int[] result = new int[nums1.length];
		for (int index = 0; index < nums1.length; index++) {
			result[index] = nextGreaterArray[nums1[index]];
		}
		return result;
	}

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Deque<Integer> stack = new ArrayDeque<>();
		Map<Integer, Integer> greaterElementMap = new HashMap<>();

		for (int index = nums2.length - 1; index >= 0; index--) {
			while (!stack.isEmpty() && nums2[index] > stack.peek()) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				greaterElementMap.put(nums2[index], -1);
			} else {
				greaterElementMap.put(nums2[index], stack.peek());
			}

			stack.push(nums2[index]);
		}

		int[] result = new int[nums1.length];
		for (int index = 0; index < nums1.length; index++) {
			result[index] = greaterElementMap.get(nums1[index]);
		}
		return result;
	}
}
