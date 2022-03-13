package easy.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MakeTheStringGreat_1544 {
	public String makeGood(String string) {
		Deque<Character> stack = new ArrayDeque<>();
		stack.push(string.charAt(string.length() - 1));
		for (int index = string.length() - 2; index >= 0; index--) {
			char character = string.charAt(index);
			if (stack.isEmpty() || (character + 32 != stack.peek() && character - 32 != stack.peek())) {
				stack.push(character);
			} else {
				stack.pop();
			}
		}

		StringBuilder result = new StringBuilder();
		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}
		return result.toString();
	}
}
