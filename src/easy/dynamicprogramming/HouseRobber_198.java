package easy.dynamicprogramming;

class HouseRobber_198 {
    public int rob(int[] nums) {
    	if(nums == null || nums.length == 0) return 0;

    	int current = 0;
    	int previous = 0;

		for (int num : nums) {
			int temp = current;
			current = Math.max(previous + num, current);
			previous = temp;
		}

        return current;
    }
}