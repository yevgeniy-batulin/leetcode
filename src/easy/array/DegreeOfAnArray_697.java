package easy.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/degree-of-an-array/
class DegreeOfAnArray_697 {
    public int findShortestSubArray(int[] nums) {
        if (nums.length == 1) return 1;

        int maxCount = 1;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            List<Integer> firstAndLastIndex = map.get(num);
            if (firstAndLastIndex == null) {
                ArrayList<Integer> indexes = new ArrayList<>(2);
                indexes.add(i);
                indexes.add(i);
                indexes.add(1);
                map.put(num, indexes);
            } else {
                firstAndLastIndex.set(1, i);
                int count = firstAndLastIndex.get(2) + 1;
                firstAndLastIndex.set(2, count);
                map.put(num, firstAndLastIndex);
                if (count > maxCount) maxCount = count;
            }
        }

        int minLength = Integer.MAX_VALUE;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> indicesAndCount = entry.getValue();
            if (indicesAndCount.get(2) == maxCount) {
                int first = indicesAndCount.get(0);
                int last = indicesAndCount.get(1);
                int length = last - first + 1;
                if (length < minLength) minLength = length;
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        System.out.println(new DegreeOfAnArray_697().findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
    }
}