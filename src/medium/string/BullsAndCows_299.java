package medium.string;

public class BullsAndCows_299 {
	public String getHint(String secret, String guess) {
		int[] count = new int[10];
		int bulls = 0;
		int cows = 0;
		for (int index = 0; index < secret.length(); index++) {
			int digitFromSecret = secret.charAt(index) - '0';
			int digitFromGuess = guess.charAt(index) - '0';

			if (digitFromSecret == digitFromGuess) {
				bulls++;
			} else {
				if (count[digitFromSecret] < 0) {
					cows++;
				}
				count[digitFromSecret]++;
				if (count[digitFromGuess] > 0) {
					cows++;
				}
				count[digitFromGuess]--;
			}
		}
		return bulls + "A" + cows + "B";
	}
}
