package medium.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BraceExpansion_1087 {
	public String[] expand(String string) {
		List<String> strings = new ArrayList<>();
		strings.add("");
		for (int index = 0; index < string.length(); index++) {
			char character = string.charAt(index);
			if (Character.isLetter(character)) {
				List<String> temp = new ArrayList<>();
				for (String s : strings) {
					temp.add(s + character);
				}
				strings = temp;
			} else {
				List<String> temp = new ArrayList<>();
				while (character != '}') {
					if (Character.isLetter(character)) {
						for (String s : strings) {
							temp.add(s + character);
						}
					}
					character = string.charAt(++index);
				}
				strings = temp;
			}
		}

		String[] result = new String[strings.size()];
		int index = 0;
		for (String s : strings) {
			result[index++] = s;
		}
		Arrays.sort(result);
		return result;
	}
}
