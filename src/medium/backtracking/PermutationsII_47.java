package medium.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class PermutationsII_47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums)
            count.put(num, count.getOrDefault(num, 0) + 1);


        permute(result, new LinkedList<>(), nums.length, count);
        return result;
    }

    private void permute(List<List<Integer>> result, LinkedList<Integer> current, int size, Map<Integer, Integer> count) {
        if (current.size() == size) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (entry.getValue() == 0)
                continue;

            current.addLast(key);
            count.put(key, value - 1);
            permute(result, current, size, count);
            current.removeLast();
            count.put(key, value);
        }
    }
}