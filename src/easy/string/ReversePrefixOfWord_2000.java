package easy.string;

public class ReversePrefixOfWord_2000 {
	public String reversePrefix(String word, char character) {
		int index = word.indexOf(character);
		if (index != -1) {
			StringBuilder result = new StringBuilder(word.substring(0, index + 1));
			return result.reverse() + word.substring(index + 1);
		}
		return word;
	}
}
