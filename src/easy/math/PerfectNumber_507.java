package easy.math;

public class PerfectNumber_507 {
	public boolean checkPerfectNumber(int num) {
		if (num < 2) {
			return false;
		}

		int sumOfDivisors = 1;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				sumOfDivisors += i;
				if (i * i != num) {
					sumOfDivisors += num / i;
				}
			}
		}
		return num == sumOfDivisors;
	}
}
