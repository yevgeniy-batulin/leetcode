package easy.math;

class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        int number = nums.length;
        for(int index = 0; index < nums.length; index++) {
            number ^= nums[index] ^ index;
        }
        return number;
    }

    public int missingNumberGaussFormula(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int fullSum = nums.length * (nums.length + 1) / 2;
        return fullSum - sum;
    }
}
