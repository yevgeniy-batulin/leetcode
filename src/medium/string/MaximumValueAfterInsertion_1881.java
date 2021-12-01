package medium.string;

public class MaximumValueAfterInsertion_1881 {
	public String maxValueShorter(String n, int x) {
		boolean negative = n.charAt(0) == '-';
		for (int index = 0; index < n.length(); index++) {
			int digit = toInt(n.charAt(index));
			if ((negative && digit > x) || (!negative && digit < x)) {
				return n.substring(0, index) + x + n.substring(index);
			}
		}
		return n + x;
	}

	public String maxValue(String n, int x) {
		if (n.charAt(0) == '-') {
			for (int index = 1; index < n.length(); index++) {
				if (toInt(n.charAt(index)) > x) {
					return "-" + n.substring(1, index) + x + n.substring(index);
				}
			}
		} else {
			for (int index = 0; index < n.length(); index++) {
				if (toInt(n.charAt(index)) < x) {
					return n.substring(0, index) + x + n.substring(index);
				}
			}
		}
		return n + x;
	}

	private int toInt(char digit) {
		return digit - '0';
	}
}
