package medium.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BuildingsWithOceanView_1762 {
	public int[] findBuildings(int[] heights) {
		Deque<Integer> stack = new ArrayDeque<>();
		for (int index = heights.length - 1; index >= 0; index--) {
			if (stack.isEmpty() || heights[stack.peek()] < heights[index]) {
				stack.push(index);
			}
		}

		int[] result = new int[stack.size()];
		for (int index = 0; index < result.length; index++) {
			result[index] = stack.pop();
		}
		return result;
	}
}
