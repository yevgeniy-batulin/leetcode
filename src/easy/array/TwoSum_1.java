package easy.array;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            Integer remainingIndex = map.get(remaining);
            if (remainingIndex != null)
                return new int[]{remainingIndex, i};

            map.put(nums[i], i);
        }
        return new int[2];
    }
}