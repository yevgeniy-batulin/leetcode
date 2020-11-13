package easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class IntersectionOfTwoArraysII_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums1)
            count.put(num, count.getOrDefault(num, 0) + 1);

        int i = 0;
        for (int num : nums2) {
            if (count.containsKey(num) && count.get(num) > 0) {
                nums1[i++] = num;
                count.put(num, count.get(num) - 1);
            }
        }

        return Arrays.copyOfRange(nums1, 0, i);
    }
}