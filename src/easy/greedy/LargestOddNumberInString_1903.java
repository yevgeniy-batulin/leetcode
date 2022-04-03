package easy.greedy;

public class LargestOddNumberInString_1903 {
	public String largestOddNumber(String num) {
		int index = num.length() - 1;
		for (; index >= 0; index--) {
			int digit = num.charAt(index) - '0';
			if (digit % 2 != 0) {
				break;
			}
		}
		return num.substring(0, index + 1);
	}
}
