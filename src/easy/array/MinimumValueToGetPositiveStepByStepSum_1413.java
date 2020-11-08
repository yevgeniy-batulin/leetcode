package easy.array;

class MinimumValueToGetPositiveStepByStepSum_1413 {
    public int minStartValue(int[] nums) {
        int minSum = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum < minSum)
                minSum = sum;
        }
        return minSum < 0 ? -minSum + 1 : 1;
    }
}