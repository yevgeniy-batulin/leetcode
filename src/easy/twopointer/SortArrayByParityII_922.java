package easy.twopointer;

public class SortArrayByParityII_922 {
	public int[] sortArrayByParityII(int[] nums) {
		int oddNumberIndex = 1;
		for (int index = 0; index < nums.length; index += 2) {
			if (nums[index] % 2 == 1) {
				while (nums[oddNumberIndex] % 2 == 1) {
					oddNumberIndex += 2;
				}

				int temp = nums[index];
				nums[index] = nums[oddNumberIndex];
				nums[oddNumberIndex] = temp;
			}
		}
		return nums;
	}
}
