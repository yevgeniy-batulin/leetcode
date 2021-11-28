package easy.string;

public class CheckIfNumbersAreAscendingInSentence_2042 {
	public boolean areNumbersAscending(String sentence) {
		String[] words = sentence.split(" ");
		int previousNumber = -1;
		for (String word : words) {
			if (Character.isDigit(word.charAt(0))) {
				int currentNumber = Integer.parseInt(word);
				if (previousNumber >= currentNumber) {
					return false;
				}
				previousNumber = currentNumber;
			}
		}
		return true;
	}
}
