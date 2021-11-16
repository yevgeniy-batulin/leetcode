package easy.math;

public class ConstructTheRectangle_492 {
	public int[] constructRectangle(int area) {
		int width = (int) Math.sqrt(area);
		while (area % width != 0) {
			width--;
		}
		return new int[]{area / width, width};
	}
}
