package easy.string;

public class MaximumNestingDepthOfTheParentheses_1614 {
	public int maxDepth(String string) {
		int maxDepth = 0;
		int depth = 0;
		for (char symbol : string.toCharArray()) {
			if (symbol == '(') {
				depth++;
			} else if (symbol == ')') {
				depth--;
			}
			maxDepth = Math.max(maxDepth, depth);
		}
		return maxDepth;
	}
}
