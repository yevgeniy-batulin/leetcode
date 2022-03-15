package medium.stack;

public class MinimumAddToMakeParenthesesValid_921 {
	public int minAddToMakeValid(String string) {
		int openBracketCount = 0;
		int closingBracketCount = 0;

		for (char character : string.toCharArray()) {
			if (character == '(') {
				openBracketCount++;
			} else {
				if (openBracketCount > 0) {
					openBracketCount--;
				} else {
					closingBracketCount++;
				}
			}
		}

		return openBracketCount + closingBracketCount;
	}
}
