package easy.math;

class MinimumMovesToEqualArrayElements_453 {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) 
        	if(nums[i] < min)
        		min = nums[i];

        int moves = 0;
        for(int i = 0; i < nums.length; i++)
        	moves += nums[i] - min;
        return moves;		
    }
}