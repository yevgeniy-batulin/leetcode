
package easy.array;

class ShuffleTheArray_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        for(int i = 0; i < n; i += 2) {
        	result[i] = nums[i];
        	result[i + 1] = nums[i + n];
        }

        return result;
    }

    public int[] shuffleInPlace(int[] nums, int n) {
    	for(int i = 0; i < n; i++)
    		nums[i] += nums[i + n] * 10000;

        for(int i = n - 1; i >= 0; i--) {
        	nums[i * 2 + 1] = nums[i] / 10000;
        	nums[i * 2] = nums[i] % 10000;
        }

        return nums;
    }
}