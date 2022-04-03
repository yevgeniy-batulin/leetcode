package medium.greedy;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeByConcatenatingTwoLetterWords_2131 {
	public int longestPalindrome(String[] words) {
		int length = 0;
		Map<String, Integer> count = new HashMap<>();
		for (String word : words) {
			String reversed = new StringBuilder(word).reverse().toString();
			if (count.containsKey(reversed)) {
				length += 4;
				count.put(reversed, count.get(reversed) - 1);
				if (count.get(reversed) == 0) {
					count.remove(reversed);
				}
			} else {
				count.put(word, count.getOrDefault(word, 0) + 1);
			}
		}

		for (Map.Entry<String, Integer> entry : count.entrySet()) {
			if (entry.getKey().charAt(0) == entry.getKey().charAt(1) && entry.getValue() == 1) {
				length += 2;
				break;
			}
		}
		return length;
	}
}
