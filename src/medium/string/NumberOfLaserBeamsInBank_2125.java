package medium.string;

public class NumberOfLaserBeamsInBank_2125 {
	public int numberOfBeams(String[] bank) {
		int prevCount = 0;
		int result = 0;
		for (String row : bank) {
			int count = getOnesCount(row);
			if (count > 0) {
				result += prevCount * count;
				prevCount = count;
			}
		}
		return result;
	}

	private int getOnesCount(String string) {
		int count = 0;
		for (char character : string.toCharArray()) {
			if (character == '1') {
				count++;
			}
		}
		return count;
	}
}
