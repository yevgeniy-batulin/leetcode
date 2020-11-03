package easy.dynamicprogramming;

import java.util.Arrays;

class MinCostClimbingStairs_746 {
    public int minCostClimbingStairs(int[] cost) {
        int current = 0;
        int previous = 0;

        for (int i = 0; i < cost.length; i++) {
            int temp = current;
            current = cost[i] + Math.min(current, previous);
            previous = temp;
        }

        return Math.min(current, previous);
    }

    public int minCostClimbingStairsRecursive(int[] cost) {
        int[] memo = new int[cost.length];
        Arrays.fill(memo, -1);
        return Math.min(helper(cost, 0, memo), helper(cost, 1, memo));
    }

    private int helper(int[] cost, int i, int[] memo) {
        if (i >= cost.length)
            return 0;
        if (memo[i] > -1)
            return memo[i];

        memo[i] = cost[i] + Math.min(helper(cost, i + 1, memo), helper(cost, i + 2, memo));

        return memo[i];
    }
}