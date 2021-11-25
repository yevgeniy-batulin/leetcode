package easy.bitmanipulation;

public class PowerOfFour_342 {
	public boolean isPowerOfFour(int number) {
		if (number <= 0) {
			return false;
		}

		int mask = 0b01010101010101010101010101010101;
		return (number & (number - 1)) == 0 && (number & mask) == number;
	}
}
