package easy.array;

class FindPivotIndex_724 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length; i++)
            sum += nums[i];

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) return i;

            leftSum += nums[i];
        }

        return -1;
    }
}