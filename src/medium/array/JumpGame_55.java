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
}