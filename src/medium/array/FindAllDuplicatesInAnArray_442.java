package medium.array;

import java.util.ArrayList;
import java.util.List;

class FindAllDuplicatesInAnArray_442 {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> duplicates = new ArrayList<>();
		for (int index = 0; index < nums.length; index++) {
			if (nums[Math.abs(nums[index]) - 1] < 0) {
				duplicates.add(Math.abs(nums[index]));
			}
			nums[Math.abs(nums[index]) - 1] *= -1;
		}

		return duplicates;
	}
}
