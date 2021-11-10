package easy.math;

public class Maximum69Number_1323 {
	public int maximum69Number (int num) {
		int divider = getDivider(num);
		int maxNum = 0;
		boolean seen = false;
		while (num > 0) {
			int div = num / divider;
			if (!seen && div == 6) {
				maxNum += 9;
				seen = true;
			} else {
				maxNum += div;
			}
			num %= divider;
			divider /= 10;
			maxNum *= 10;
		}
		return maxNum / 10;
	}

	private int getDivider(int num) {
		int divider = 10;
		while (num / divider > 0) {
			divider *= 10;
		}
		return divider;
	}
}
