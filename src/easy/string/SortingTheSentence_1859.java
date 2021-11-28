package easy.string;

public class SortingTheSentence_1859 {
	public String sortSentenceShorter(String shuffledSentence) {
		String[] words = shuffledSentence.split(" ");
		String[] sentence = new String[words.length];
		for (String word : words) {
			int index = word.charAt(word.length() - 1) - '1';
			sentence[index] = word.substring(0, word.length() - 1);
		}
		return String.join(" ", sentence);
	}

	public String sortSentence(String shuffledSentence) {
		String[] words = new String[9];
		StringBuilder word = new StringBuilder();
		for (int index = 0; index < shuffledSentence.length(); index++) {
			char character = shuffledSentence.charAt(index);
			if (Character.isDigit(character)) {
				words[character - '1'] = word.toString();
				word.setLength(0);
				index++;
			} else {
				word.append(character);
			}
		}

		StringBuilder sentence = new StringBuilder();
		for (int index = 0; index < words.length && words[index] != null; index++) {
			sentence.append(words[index]);
			if (index < words.length - 1 && words[index + 1] != null) {
				sentence.append(" ");
			}
		}
		return sentence.toString();
	}
}
