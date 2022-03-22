package easy.array;

public class MaximumProductOfTwoElementsInArray_1464 {
	public int maxProduct(int[] nums) {
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int number : nums) {
			if (number > firstMax) {
				secondMax = firstMax;
				firstMax = number;
			} else if (number > secondMax) {
				secondMax = number;
			}
		}

		return (firstMax - 1) * (secondMax - 1);
	}
}
