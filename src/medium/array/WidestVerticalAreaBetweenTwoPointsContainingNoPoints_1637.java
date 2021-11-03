package medium.array;

import java.util.Arrays;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints_1637 {
	public int maxWidthOfVerticalArea(int[][] points) {
		int[] xs = new int[points.length];
		for (int i = 0; i < points.length; i++) {
			xs[i] = points[i][0];
		}
		Arrays.sort(xs);
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < xs.length; i++) {
			max = Math.max(max, xs[i] - xs[i - 1]);
		}
		return max;
	}
}
