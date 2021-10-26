package easy.array;

public class MinimumOperationsToMakeTheArrayIncreasing_1827 {
    public int minOperations(int[] nums) {
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            int difference = nums[i - 1] - nums[i] + 1;
            if (difference > 0) {
                nums[i] += difference;
                result += difference;
            }
        }
        return result;
    }

}
