package easy.string;

public class CheckIfSentenceIsPangram_1832 {
	public boolean checkIfPangram(String sentence) {
		boolean[] seenLetters = new boolean[26];
		for (char character : sentence.toCharArray()) {
			seenLetters[character - 'a'] = true;
		}

		for (boolean seenLetter : seenLetters) {
			if (!seenLetter) {
				return false;
			}
		}
		return true;
	}
}
