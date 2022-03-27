package easy.dynamicprogramming;

public class NthTribonacciNumber_1137 {
	public int tribonacci(int n) {
		if (n < 2) {
			return n;
		}
		if (n < 4) {
			return n - 1;
		}

		int first = 0;
		int second = 1;
		int third = 1;

		for (int counter = 3; counter < n; counter++) {
			int newThird = first + second + third;
			first = second;
			second = third;
			third = newThird;
		}

		return first + second + third;
	}
}
