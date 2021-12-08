package easy.string;

public class DetectCapital_520 {
	public boolean detectCapitalUseShorter(String word) {
		if(word.length() < 2) return true;
		if(word.toUpperCase().equals(word)) return true;

		return word.substring(1).toLowerCase().equals(word.substring(1));
	}

	public boolean detectCapitalUse(String word) {
		if (Character.isLowerCase(word.charAt(0))) {
			for (char letter : word.toCharArray()) {
				if (Character.isUpperCase(letter)) {
					return false;
				}
			}
		} else if (word.length() > 1) {
			if (Character.isLowerCase(word.charAt(1))) {
				for (int index = 1; index < word.length(); index++) {
					if (Character.isUpperCase(word.charAt(index))) {
						return false;
					}
				}
			} else {
				for (char letter : word.toCharArray()) {
					if (Character.isLowerCase(letter)) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
