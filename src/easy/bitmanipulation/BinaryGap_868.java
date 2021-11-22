package easy.bitmanipulation;

public class BinaryGap_868 {
	public int binaryGapFaster(int number) {
		int maxGap = 0;
		int distance = -32;
		while (number > 0) {
			if (number % 2 == 1) {
				maxGap = Math.max(maxGap, distance);
				distance = 0;
			}
			distance++;
			number /= 2;
		}
		return maxGap;
	}

	public int binaryGap(int number) {
		String binaryNumber = Integer.toBinaryString(number);
		int maxGap = 0;
		int firstIndex = 0;
		int secondIndex = 1;
		while (secondIndex < binaryNumber.length()) {
			if (binaryNumber.charAt(secondIndex) == '1') {
				maxGap = Math.max(maxGap, secondIndex - firstIndex);
				firstIndex = secondIndex;
			}
			secondIndex++;
		}
		return maxGap;
	}
}
