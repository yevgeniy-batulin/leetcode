package easy.math;

public class Base7_504 {
	public String convertToBase7(int number) {
		if (number == 0) return "0";

		StringBuilder converted = new StringBuilder();
		boolean negative = number < 0;
		while (number != 0) {
			converted.append(Math.abs(number % 7));
			number /= 7;
		}
		if (negative) {
			converted.append("-");
		}
		return converted.reverse().toString();
	}
}
