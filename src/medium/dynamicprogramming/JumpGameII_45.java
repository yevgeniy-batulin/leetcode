package medium.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class JumpGameII_45 {
	private final Map<Integer, Integer> memo = new HashMap<>();

	public int jump(int[] nums) {
		return minJumpsFrom(nums, 0);
	}

	private int minJumpsFrom(int[] nums, int index) {
		if (index >= nums.length - 1) {
			return 0;
		}

		if (!memo.containsKey(index)) {
			int minJumps = 1000001;
			for (int jump = nums[index]; jump > 0; jump--) {
				minJumps = Math.min(minJumps, 1 + minJumpsFrom(nums, index + jump));
			}
			memo.put(index, minJumps);
		}

		return memo.get(index);
	}
}
