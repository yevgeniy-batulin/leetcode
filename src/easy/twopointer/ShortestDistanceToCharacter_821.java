package easy.twopointer;

public class ShortestDistanceToCharacter_821 {
	public int[] shortestToChar(String string, char letter) {
		int[] distance = new int[string.length()];
		int letterIndex = -string.length();

		for (int index = 0; index < string.length(); index++) {
			if (string.charAt(index) == letter) {
				letterIndex = index;
			}
			distance[index] = index - letterIndex;
		}

		for (int index = letterIndex - 1; index >= 0; index--) {
			if (string.charAt(index) == letter) {
				letterIndex = index;
			}
			distance[index] = Math.min(distance[index], letterIndex - index);
		}

		return distance;
	}

	public int[] shortestToCharAlternative(String string, char letter) {
		char[] chars = string.toCharArray();
		int first = findNextIndex(chars, 0, letter);
		int second = findNextIndex(chars, first + 1, letter);
		int[] distance = new int[string.length()];
		for (int index = 0; index < chars.length; index++) {
			if (index == second) {
				first = second;
				second = findNextIndex(chars, second + 1, letter);
			}

			distance[index] = Math.min(Math.abs(first - index), Math.abs(second - index));
		}
		return distance;
	}

	private int findNextIndex(char[] array, int start, char target) {
		for (int index = start; index < array.length; index++) {
			if (array[index] == target) {
				return index;
			}
		}
		return Integer.MAX_VALUE;
	}
}
