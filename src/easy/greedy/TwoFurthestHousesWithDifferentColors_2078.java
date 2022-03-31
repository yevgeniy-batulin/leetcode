package easy.greedy;

public class TwoFurthestHousesWithDifferentColors_2078 {
	public int maxDistance(int[] colors) {
		for (int left = 0, right = colors.length - 1; left <= right; left++, right--) {
			if (colors[colors.length - 1] != colors[left]) {
				return colors.length - 1 - left;
			}
			if (colors[0] != colors[right]) {
				return right;
			}
		}
		return 0;
	}
}
