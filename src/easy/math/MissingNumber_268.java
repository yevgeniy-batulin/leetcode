package easy.math;

// https://leetcode.com/problems/missing-number/
class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int fullSum = nums.length * (nums.length + 1) / 2;
        return fullSum - sum;
    }
}