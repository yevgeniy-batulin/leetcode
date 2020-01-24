package easy.array;

import java.util.Arrays;

// https://leetcode.com/problems/array-partition-i/
class ArrayPartition_561 {
    public int arrayPairSum(int[] nums) {
        if (nums.length == 2) return Math.min(nums[0], nums[1]);

        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            result += nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ArrayPartition_561().arrayPairSum(new int[]{1, 4, 3, 2}));
    }
}