package easy.greedy;

import java.util.Arrays;

public class HowManyApplesCanYouPutIntoTheBasket_1196 {
	public int maxNumberOfApples(int[] weights) {
		Arrays.sort(weights);
		int basketWeight = 5000;
		int appleCount = 0;
		for (int weight : weights) {
			basketWeight -= weight;
			if (basketWeight < 0) {
				break;
			}
			appleCount++;
		}
		return appleCount;
	}
}
