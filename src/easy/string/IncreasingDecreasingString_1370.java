package easy.string;

public class IncreasingDecreasingString_1370 {
	public String sortString(String string) {
		int[] count = new int[26];
		for (char letter : string.toCharArray()) {
			count[letter - 'a']++;
		}

		int size = 0;
		StringBuilder sorted = new StringBuilder();
		while (size < string.length()) {
			for (int index = 0; index < 26; index++) {
				if (count[index] > 0) {
					sorted.append((char) (index + 'a'));
					count[index]--;
					size++;
				}
			}
			for (int index = 25; index >= 0; index--) {
				if (count[index] > 0) {
					sorted.append((char) (index + 'a'));
					count[index]--;
					size++;
				}
			}
		}
		return sorted.toString();
	}
}
