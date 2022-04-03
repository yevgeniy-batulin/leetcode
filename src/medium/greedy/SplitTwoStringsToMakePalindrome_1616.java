package medium.greedy;

public class SplitTwoStringsToMakePalindrome_1616 {
	public boolean checkPalindromeFormation(String a, String b) {
		if (a.length() == 1) {
			return true;
		}

		return checkPalindrome(a, b) || checkPalindrome(b, a);
	}

	private boolean checkPalindrome(String firstString, String secondString) {
		int left = 0;
		int right = secondString.length() - 1;

		while (left < right && firstString.charAt(left) == secondString.charAt(right)) {
			left++;
			right--;
		}

		return isPalindrome(firstString, left, right) || isPalindrome(secondString, left, right);
	}

	private boolean isPalindrome(String string, int left, int right) {
		while (left < right) {
			if (string.charAt(left) != string.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
