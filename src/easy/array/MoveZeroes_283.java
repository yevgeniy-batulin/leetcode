package easy.array;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/
class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        int lastNonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZero++] = nums[i];
            }
        }

        Arrays.fill(nums, lastNonZero, nums.length, 0);
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1};
        new MoveZeroes_283().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}