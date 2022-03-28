package easy.greedy;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits_2160 {
	public int minimumSum(int num) {
		int[] count = new int[10];
		while (num != 0) {
			count[num % 10]++;
			num /= 10;
		}

		int first = 0;
		int second = 0;
		for (int number = 1; number < 10; number++) {
			while (count[number] > 0) {
				if (first <= second) {
					first = first * 10 + number;
				} else {
					second = second * 10 + number;
				}
				count[number]--;
			}
		}
		return first + second;
	}
}
