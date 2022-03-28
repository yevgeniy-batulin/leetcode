package easy.greedy;

public class MaximumUnitsOnTruck_1710 {
	public int maximumUnits(int[][] boxTypes, int truckSize) {
		int[] count = new int[1001];
		for (int[] boxType : boxTypes) {
			count[boxType[1]] += boxType[0];
		}

		int numberOfBoxes = 0;
		for (int units = count.length - 1; units >= 0 && truckSize > 0; units--) {
			if (count[units] > 0) {
				int maxBoxesToTake = Math.min(truckSize, count[units]);
				numberOfBoxes += maxBoxesToTake * units;
				truckSize -= maxBoxesToTake;
			}
		}
		return numberOfBoxes;
	}
}
