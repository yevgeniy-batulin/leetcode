package medium.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreaterElement_503 {
	public int[] nextGreaterElements(int[] nums) {
		Deque<Integer> stack = new ArrayDeque<>();
		int[] greaterElements = new int[nums.length];

		for (int index = 2 * nums.length - 1; index >= 0; index--) {
			int correctedIndex = index % nums.length;
			while (!stack.isEmpty() && nums[correctedIndex] >= nums[stack.peek()]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				greaterElements[correctedIndex] = -1;
			} else {
				greaterElements[correctedIndex] = nums[stack.peek()];
			}

			stack.push(correctedIndex);
		}

		return greaterElements;
	}
}
