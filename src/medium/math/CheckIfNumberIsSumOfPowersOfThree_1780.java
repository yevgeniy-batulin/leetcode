package medium.math;

public class CheckIfNumberIsSumOfPowersOfThree_1780 {
	public boolean checkPowersOfThree(int number) {
		int powerOfThree = getMaxPower(number);
		while (number >= 1 && powerOfThree >= 1) {
			if (number - powerOfThree >= 0) {
				number -= powerOfThree;
			}
			powerOfThree /= 3;
		}
		return number == 0;
	}

	private int getMaxPower(int number) {
		int maxPower = 1;
		while (maxPower * 3 <= number) {
			maxPower *= 3;
		}
		return maxPower;
	}
}
