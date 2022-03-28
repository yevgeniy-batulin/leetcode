package medium.array;

class JumpGame_55 {
    public boolean canJump(int[] nums) {
        int jump = 0;
        for(int i = 0; i < nums.length - 1; i++) {
        	jump = Math.max(jump - 1, nums[i]);

        	if(jump == 0)
        		return false;
        }
        return true;
    }

	public boolean canJumpDP(int[] nums) {
		boolean[] reachable = new boolean[nums.length];
		reachable[0] = true;

		for(int index = 0; index < nums.length; index++) {
			if(reachable[index]) {
				for(int jump = nums[index]; jump > 0; jump--) {
					if(index + jump >= nums.length - 1) {
						return true;
					}
					reachable[index + jump] = true;
				}
			}
		}

		return reachable[reachable.length - 1];
	}
}
