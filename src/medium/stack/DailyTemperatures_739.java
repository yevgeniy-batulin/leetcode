package medium.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures_739 {
	public int[] dailyTemperatures(int[] temperatures) {
		int[] answer = new int[temperatures.length];
		int hottest = 0;
		for (int index = temperatures.length - 1; index >= 0; index--) {
			if(temperatures[index] > hottest) {
				hottest = temperatures[index];
				continue;
			}

			int days = 1;
			while(temperatures[index + days] <= temperatures[index]) {
				days += answer[index + days];
			}
			answer[index] = days;
		}
		return answer;
	}

	public int[] dailyTemperaturesMoreMemory(int[] temperatures) {
		Deque<Integer> stack = new ArrayDeque<>();
		int[] answer = new int[temperatures.length];
		for (int index = temperatures.length - 1; index >= 0; index--) {
			while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[index]) {
				stack.pop();
			}

			answer[index] = stack.isEmpty() ? 0 : stack.peek() - index;
			stack.push(index);
		}
		return answer;
	}
}
