package easy.array;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfPairsWithAbsoluteDifferenceK_2006 {
    public int countKDifferenceBruteforce(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public int countKDifference(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            count += map.getOrDefault(num - k, 0) + map.getOrDefault(num + k, 0);
        }
        return count;
    }
}
