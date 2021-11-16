package medium.math;

public class ClumsyFactorial_1006 {
	public int clumsy(int number) {
		if (number == 1) return 1;

		int result = 0;
		int runningValue = number--;
		while (number > 0) {
			runningValue *= number--;
			if (number > 0) runningValue /= number--;
			if (number > 0) runningValue += number--;
			result += runningValue;
			if (number > 0) {
				runningValue = -number;
				number--;
			} else {
				runningValue = 0;
			}
		}
		return result + runningValue;
	}
}
