package medium.string;

class PartitioningIntoMinimumNumberOfDeciBinaryNumbers_1689 {
	public int minPartitions(String n) {
		int maxDigit = 0;
		for (char digit : n.toCharArray()) {
			maxDigit = Math.max(maxDigit, digit - '0');
		}
		return maxDigit;
	}
}
