package easy.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/high-five/
class HighFive_1086 {
    public int[][] highFive(int[][] items) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] item : items) {
            if (!map.containsKey(item[0]))
                map.put(item[0], new ArrayList<>());

            map.get(item[0]).add(item[1]);
        }
        int[][] result = new int[map.size()][2];
        int i = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            result[i][0] = entry.getKey();
            result[i][1] = average(entry.getValue());
            i++;
        }
        Arrays.sort(result, Comparator.comparingInt(it -> it[0]));
        return result;
    }

    private int average(List<Integer> list) {
        list.sort(Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += list.get(i);
        }
        return sum / 5;
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.deepToString(
                        new HighFive_1086().highFive(
                                new int[][]{{1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}})));
    }
}