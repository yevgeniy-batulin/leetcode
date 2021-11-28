package medium.bitmanipulation;

public class MaximumXorForEachQuery_1829 {
	public int[] getMaximumXorFaster(int[] numbers, int maximumBit) {
		int maxNumber = (1 << maximumBit) - 1;
		int[] xorArray = new int[numbers.length];
		int runningXor = 0;
		for (int index = xorArray.length - 1; index >= 0; index--) {
			runningXor ^= numbers[xorArray.length - index - 1];
			xorArray[index] = maxNumber ^ runningXor;
		}
		return xorArray;
	}

	public int[] getMaximumXor(int[] numbers, int maximumBit) {
		int[] prefixArray = new int[numbers.length];
		prefixArray[prefixArray.length - 1] = numbers[0];
		for (int index = prefixArray.length - 2; index >= 0; index--) {
			prefixArray[index] = prefixArray[index + 1] ^ numbers[prefixArray.length - index - 1];
		}
		int maxNumber = (int) Math.pow(2, maximumBit) - 1;
		for (int index = 0; index < prefixArray.length; index++) {
			prefixArray[index] = maxNumber - prefixArray[index];
		}
		return prefixArray;
	}
}
