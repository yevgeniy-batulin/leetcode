package medium.string;

public class ShiftingLetters_848 {
	public String shiftingLettersImproved(String string, int[] shifts) {
		int shift = 0;
		char[] charArray = string.toCharArray();
		for (int index = charArray.length - 1; index >= 0; index--) {
			shift += shifts[index] % 26;
			charArray[index] = (char) ((charArray[index] - 'a' + shift) % 26 + 'a');
		}
		return new String(charArray);
	}

	public String shiftingLetters(String string, int[] shifts) {
		int previous = 0;
		char[] charArray = string.toCharArray();
		for (int index = charArray.length - 1; index >= 0; index--) {
			int newChar = charArray[index] + (previous + shifts[index] % 26) % 26;
			if (newChar > 'z') {
				newChar = (newChar % ('z' + 1)) + 'a';
			}
			charArray[index] = (char) newChar;
			previous += shifts[index] % 26;
		}
		return new String(charArray);
	}

	public static void main(String[] args) {
		System.out.println(new ShiftingLetters_848().shiftingLetters("zvhez", new int[]{10, 16, 10, 26, 26}));
	}
}
