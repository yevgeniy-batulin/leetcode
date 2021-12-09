package easy.string;

import java.util.HashMap;
import java.util.Map;

public class DecryptStringFromAlphabetToIntegerMapping_1309 {
	public String freqAlphabets(String string) {
		Map<String, Character> mapping = new HashMap<>();
		int key = 1;
		char value = 'a';
		while (value <= 'z') {
			mapping.put(String.valueOf(key++), value++);
		}

		StringBuilder decrypted = new StringBuilder();
		for (int index = string.length() - 1; index >= 0; index--) {
			String number;
			if (string.charAt(index) == '#') {
				number = new String(new char[]{string.charAt(index - 2), string.charAt(index - 1)});
				index -= 2;
			} else {
				number = String.valueOf(string.charAt(index));
			}
			decrypted.append(mapping.get(number));
		}
		return decrypted.reverse().toString();
	}
}
