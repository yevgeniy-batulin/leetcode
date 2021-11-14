package easy.math;

public class ValidPerfectSquare_367 {
	public boolean isPerfectSquare(int number) {
		int target = 1;
		while (target * target <= number) {
			target++;
		}
		return target * target == number;
	}
}
