package easy.math;

public class PowerOfThree_326 {
	public boolean isPowerOfThree(int n) {
		if (n == 0) return false;

		while (n % 3 == 0) {
			n /= 3;
		}
		return n == 1 || n == -1;
	}
}
