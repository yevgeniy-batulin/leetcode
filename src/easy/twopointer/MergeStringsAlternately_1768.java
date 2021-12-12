package easy.twopointer;

public class MergeStringsAlternately_1768 {
	public String mergeAlternately(String word1, String word2) {
		StringBuilder merged = new StringBuilder();
		int indexFirstWord = 0;
		int indexSecondWord = 0;
		while (indexFirstWord < word1.length() && indexSecondWord < word2.length()) {
			merged.append(word1.charAt(indexFirstWord++));
			merged.append(word2.charAt(indexSecondWord++));
		}

		if (indexFirstWord < word1.length()) {
			merged.append(word1.substring(indexFirstWord));
		}
		if (indexSecondWord < word2.length()) {
			merged.append(word2.substring(indexSecondWord));
		}
		return merged.toString();
	}
}
