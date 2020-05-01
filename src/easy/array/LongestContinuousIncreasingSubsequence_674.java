package easy.array;

import java.util.HashMap;

// https://leetcode.com/problems/longest-continuous-increasing-subsequence/
public class LongestContinuousIncreasingSubsequence_674 {
    public int findLengthOfLCIS(int[] nums) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        if (nums.length == 0) return 0;

        int max = 1;
        int current = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                current++;
            } else {
                max = Math.max(max, current);
                current = 1;
            }
        }
        return Math.max(max, current);
    }
}