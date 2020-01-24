package easy.array;

import java.util.List;

// https://leetcode.com/problems/maximum-distance-in-arrays/
class MaximumDistanceInArrays_624 {
    public int maxDistance(List<List<Integer>> arrays) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrays.size(); i++) {
            Integer first = arrays.get(i).get(0);
            for (int j = 0; j < arrays.size(); j++) {
                if (i != j) {
                    Integer last = arrays.get(j).get(arrays.get(j).size() - 1);
                    int difference = Math.abs(last - first);
                    if (difference > max) max = difference;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumDistanceInArrays_624().maxDistance(List.of(List.of(1, 5), List.of(3, 4))));
    }
}