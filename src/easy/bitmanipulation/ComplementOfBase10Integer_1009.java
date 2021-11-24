package easy.bitmanipulation;

public class ComplementOfBase10Integer_1009 {
	public int bitwiseComplement(int n) {
		if (n == 0) return 1;

		int complement = 0;
		int multiplier = 1;
		while (n > 0) {
			if (n % 2 == 0) {
				complement += multiplier;
			}
			multiplier *= 2;
			n /= 2;
		}
		return complement;
	}

	public int bitwiseComplementAlternative(int n) {
		int sum = 1;
		while(n > sum) {
			sum = sum * 2 + 1;
		}
		return sum - n;
	}
}
