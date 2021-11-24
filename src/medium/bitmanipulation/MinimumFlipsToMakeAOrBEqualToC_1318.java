package medium.bitmanipulation;

public class MinimumFlipsToMakeAOrBEqualToC_1318 {
	public int minFlips(int a, int b, int c) {
		int flips = 0;
		while ((a | b | c) > 0) {
			int bitOfA = a % 2;
			int bitOfB = b % 2;
			int bitOfC = c % 2;

			if (bitOfC == 0) {
				flips += bitOfA + bitOfB;
			} else if (bitOfA + bitOfB == 0) {
				flips++;
			}

			a /= 2;
			b /= 2;
			c /= 2;
		}
		return flips;
	}

	public int minFlipsAlternative(int a, int b, int c) {
		int flips = 0;
		while ((a | b | c) > 0) {
			int bitOfA = a & 1;
			int bitOfB = b & 1;
			int bitOfC = c & 1;

			if (bitOfC == 0) {
				flips += bitOfA + bitOfB;
			} else if (bitOfA + bitOfB == 0) {
				flips++;
			}

			a >>= 1;
			b >>= 1;
			c >>= 1;
		}
		return flips;
	}

	public static void main(String[] args) {
		System.out.println(new MinimumFlipsToMakeAOrBEqualToC_1318().minFlips(807906164, 773964243, 741116435));
	}
}
