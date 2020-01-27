package medium.array;

// https://leetcode.com/problems/subarray-sum-equals-k/
class SubarraySumEqualsK_560 {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 1) return k == nums[0] ? 1 : 0;

        int result = 0;
        int remaining = k;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                remaining -= nums[j];
                if (remaining == 0) {
                    result++;
                }
            }
            remaining = k;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new SubarraySumEqualsK_560().subarraySum(new int[]{0,0,0,0,0,0,0,0,0,0}, 0));
    }
}