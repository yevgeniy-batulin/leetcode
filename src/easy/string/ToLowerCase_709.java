package easy.string;

import java.util.List;
import java.util.Map;

public class ToLowerCase_709 {
	public String toLowerCase(String string) {
		char[] charArray = string.toCharArray();
		int diff = 'A' - 'a';
		for (int index = 0; index < charArray.length; index++) {
			if (charArray[index] >= 'A' && charArray[index] <= 'Z') {
				charArray[index] -= diff;
			}
		}
		return new String(charArray);
	}

	public static void main(String[] args) {

	}
}
