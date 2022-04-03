package easy.greedy;

public class LongestPalindrome_409 {
	public int longestPalindrome(String string) {
		int[] count = new int[57];
		for (char letter : string.toCharArray()) {
			count[letter - 'a']++;
		}

		int length = 0;
		boolean oneMoreLetter = false;
		for (int value : count) {
			if (value % 2 != 0) {
				length += value - 1;
				oneMoreLetter = true;
			} else {
				length += value;
			}
		}
		return oneMoreLetter ? length + 1 : length;
	}
}
