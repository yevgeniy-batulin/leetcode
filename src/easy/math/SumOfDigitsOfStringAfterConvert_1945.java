package easy.math;

public class SumOfDigitsOfStringAfterConvert_1945 {
	public int getLucky(String s, int k) {
		int number = transform(s);
		while (k > 1) {
			int sum = 0;
			while (number > 0) {
				sum += number % 10;
				number /= 10;
			}
			number = sum;
			k--;
		}
		return number;
	}

	private int transform(String s) {
		int sum = 0;
		for (int index = 0; index < s.length(); index++) {
			int number = s.charAt(index) - 'a' + 1;
			sum += number % 10 + number / 10;
		}
		return sum;
	}
}
