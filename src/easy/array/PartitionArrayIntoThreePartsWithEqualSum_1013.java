package easy.array;

class PartitionArrayIntoThreePartsWithEqualSum_1013 {
    public boolean canThreePartsEqualSum(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 3 != 0) return false;
        sum /= 3;
        int partialSum = 0;
        int partsCount = 0;
        for (int i = 0; i < nums.length; i++) {
            partialSum += nums[i];

            if (partialSum == sum) {
                partsCount++;
                partialSum = 0;
            }
        }

        return partsCount >= 3 && partialSum == 0;
    }
}