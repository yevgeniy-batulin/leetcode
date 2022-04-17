package easy.math;

class SingleNumber_136 {
	public int singleNumber(int[] nums) {
		int xor = 0;
		for (int num : nums) {
			xor ^= num;
		}
		return xor;
	}
}
