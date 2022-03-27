package easy.dynamicprogramming;

public class FibonacciNumber_509 {
	public int fib(int n) {
		if (n < 2) {
			return n;
		}

		int first = 0;
		int second = 1;
		while (n > 2) {
			int temp = first + second;
			first = second;
			second = temp;
			n--;
		}

		return first + second;
	}
}
