package easy.math;

public class UglyNumber_263 {
	public boolean isUgly(int n) {
		if (n <= 0) return false;

		n = divideBy(n, 2);
		n = divideBy(n, 3);
		n = divideBy(n, 5);
		return n == 1;
	}

	private int divideBy(int dividend, int divisor) {
		while (dividend % divisor == 0) {
			dividend /= 2;
		}
		return dividend;
	}

	public static void main(String[] args) {
		System.out.println(new UglyNumber_263().isUgly(-2147483648));
	}
}
