package easy.dynamicprogramming;

import java.util.Arrays;

class MinCostClimbingStairs_746 {
    public int minCostClimbingStairs(int[] cost) {
        int current = 0;
        int previous = 0;

        for (int index = 0; index < cost.length; index++) {
            int temp = current;
            current = cost[index] + Math.min(current, previous);
            previous = temp;
        }

        return Math.min(current, previous);
    }
}
