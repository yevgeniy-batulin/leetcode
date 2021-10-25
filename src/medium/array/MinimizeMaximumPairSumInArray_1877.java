package medium.array;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray_1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            result = Math.max(result, nums[i] + nums[nums.length - i - 1]);
        }
        return result;
    }
}
