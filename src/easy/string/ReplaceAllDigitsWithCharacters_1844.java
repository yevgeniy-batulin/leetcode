package easy.string;

public class ReplaceAllDigitsWithCharacters_1844 {
	public String replaceDigits(String string) {
		char[] charArray = string.toCharArray();
		for (int index = 1; index < charArray.length; index += 2) {
			charArray[index] = (char) (charArray[index - 1] + charArray[index] - '0');
		}
		return new String(charArray);
	}
}
