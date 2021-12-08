package easy.string;

public class DetermineIfStringHalvesAreAlike_1704 {
	public boolean halvesAreAlike(String string) {
		String vowels = "aeiouAEIOU";
		int left = 0;
		int right = 0;
		for (int index = 0; index < string.length() / 2; index++) {
			if (vowels.indexOf(string.charAt(index)) != -1) {
				left++;
			}
			if (vowels.indexOf(string.charAt(string.length() - index - 1)) != -1) {
				right++;
			}
		}
		return left == right;
	}
}
