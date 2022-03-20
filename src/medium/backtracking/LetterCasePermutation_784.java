package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation_784 {
	public List<String> letterCasePermutation(String string) {
		List<String> permutations = new ArrayList<>();
		helper(string, 0, "", permutations);
		return permutations;
	}

	private void helper(String string, int index, String permutation, List<String> permutations) {
		if (index == string.length()) {
			permutations.add(permutation);
			return;
		}

		char character = string.charAt(index);
		if (Character.isLetter(character)) {
			helper(string, index + 1, permutation + Character.toUpperCase(character), permutations);
			helper(string, index + 1, permutation + Character.toLowerCase(character), permutations);
		} else {
			helper(string, index + 1, permutation + character, permutations);
		}
	}
}
