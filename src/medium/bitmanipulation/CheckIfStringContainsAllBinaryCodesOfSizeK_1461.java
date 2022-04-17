package medium.bitmanipulation;

import java.util.HashSet;
import java.util.Set;

public class CheckIfStringContainsAllBinaryCodesOfSizeK_1461 {
	public boolean hasAllCodes(String s, int k) {
		if (s.length() < k) {
			return false;
		}

		int hash = 0;
		for (int index = 0; index < k; index++) {
			hash = hash << 1 | s.charAt(index) - '0';
		}
		Set<Integer> set = new HashSet<>();
		set.add(hash);

		int needed = 1 << k;
		int allOnes = needed - 1;
		for (int index = k; index < s.length(); index++) {
			hash = ((hash << 1) & allOnes) | (s.charAt(index) - '0');
			set.add(hash);
		}

		return set.size() == needed;
	}
}
