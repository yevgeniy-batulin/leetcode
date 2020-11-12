package medium.array;

import java.util.HashMap;
import java.util.Map;

public class DotProductOfTwoSparseVectors_1570 {
    static class SparseVector {
        private Map<Integer, Integer> coordinates;

        SparseVector(int[] nums) {
            coordinates = new HashMap<>();
            for (int i = 0; i < nums.length; i++)
                if (nums[i] > 0)
                    coordinates.put(i, nums[i]);
        }

        // Return the dotProduct of two sparse vectors
        public int dotProduct(SparseVector vec) {
            int product = 0;
            Map<Integer, Integer> smaller;
            Map<Integer, Integer> bigger;
            if (vec.getCoordinates().size() > coordinates.size()) {
                smaller = coordinates;
                bigger = vec.getCoordinates();
            } else {
                smaller = vec.getCoordinates();
                bigger = coordinates;
            }

            for (Map.Entry<Integer, Integer> entry : smaller.entrySet()) {
                if (bigger.containsKey(entry.getKey()))
                    product += entry.getValue() * bigger.get(entry.getKey());
            }
            return product;
        }

        private Map<Integer, Integer> getCoordinates() {
            return new HashMap<>(coordinates);
        }
    }
}