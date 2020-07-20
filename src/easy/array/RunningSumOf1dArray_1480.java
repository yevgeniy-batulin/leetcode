package easy.array;

public class RunningSumOf1dArray_1480 {
    public int[] runningSum(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
