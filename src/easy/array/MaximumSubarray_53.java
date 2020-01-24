package easy.array;

// https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i] + currentSum, nums[i]);

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumSubarray_53().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -7, 4, 0, 5, -6}));
    }
}