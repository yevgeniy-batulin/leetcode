package easy.math;

public class ArrangingCoins_441 {
	public int arrangeCoins(int n) {
		int count = 1;
		for (; n >= count; count++) {
			n -= count;
		}
		return count;
	}
}
