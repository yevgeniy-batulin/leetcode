package easy.string;

public class RemoveOutermostParentheses_1021 {
	public String removeOuterParenthesesShorter(String string) {
		StringBuilder result = new StringBuilder();
		int opened = 0;
		for (char parentheses : string.toCharArray()) {
			if (parentheses == '(' && opened++ > 0) {
				result.append(parentheses);
			}
			if (parentheses == ')' && opened-- > 1) {
				result.append(parentheses);
			}
		}
		return result.toString();
	}

	public String removeOuterParentheses(String string) {
		StringBuilder result = new StringBuilder();
		int counter = 1;
		for (int index = 1; index < string.length(); index++) {
			if (string.charAt(index) == ')') {
				counter--;
			} else {
				counter++;
			}

			if (counter == 0) {
				index++;
				counter++;
			} else {
				result.append(string.charAt(index));
			}
		}
		return result.toString();
	}
}
