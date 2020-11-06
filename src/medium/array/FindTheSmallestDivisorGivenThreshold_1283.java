package medium.array;

class FindTheSmallestDivisorGivenThreshold_1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = max(nums);

        while (left <= right) {
            int middle = (right - left) / 2 + left;
            int sum = sum(nums, middle);
            if (sum <= threshold) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }

        }
        return left;
    }

    private int max(int[] nums) {
        int right = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > right)
                right = nums[i];
        }
        return right;
    }

    private int sum(int[] nums, int divisor) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += divide(nums[i], divisor);
        }
        return sum;
    }

    private int divide(int divident, int divisor) {
        int result = divident / divisor;
        if (divident % divisor > 0)
            result++;
        return result;
    }
}