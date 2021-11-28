package easy.string;

public class SplitStringInBalancedStrings_1221 {
	public int balancedStringSplit(String s) {
		int count = 0;
		int balanceCount = 0;
		for (char letter : s.toCharArray()) {
			if (letter == 'L') {
				balanceCount--;
			} else {
				balanceCount++;
			}
			if (balanceCount == 0) {
				count++;
			}
		}
		return count;
	}
}
