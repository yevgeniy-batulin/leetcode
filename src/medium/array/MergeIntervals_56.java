package medium.array;

import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/merge-intervals/
class MergeIntervals_56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[][] result = new int[intervals.length][2];
        int counter = 0;
        result[0] = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (result[counter][1] >= intervals[i][0]) {
                result[counter][1] = Math.max(result[counter][1], intervals[i][1]);
            } else {
                result[++counter] = intervals[i];
            }
        }
        return Arrays.copyOf(result, counter + 1);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MergeIntervals_56().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
//        System.out.println(Arrays.toString(new MergeIntervals_56().merge(new int[][]{{1, 3}})));
    }
}