package easy.string;

public class CountSubstringsWithOnlyOneDistinctLetter_1180 {
	public int countLetters(String string) {
		int count = 1;
		int currentLength = 1;
		for (int index = 1; index < string.length(); index++) {
			if (string.charAt(index) == string.charAt(index - 1)) {
				currentLength++;
			} else {
				currentLength = 1;
			}
			count += currentLength;
		}
		return count;
	}
}
