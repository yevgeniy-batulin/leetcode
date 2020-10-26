package easy.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MinimumIndexSumOfTwoLists_599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++)
            map.put(list1[i], i);

        Map<String, Integer> indexSumMap = new HashMap<>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int sum = i + map.get(list2[i]);
                indexSumMap.put(list2[i], sum);
                if (sum < minSum)
                    minSum = sum;
            }
        }

        List<String> answers = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : indexSumMap.entrySet()) {
            if (entry.getValue() == minSum)
                answers.add(entry.getKey());
        }
        return answers.toArray(new String[]{});
    }
}