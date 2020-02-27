package easy.hashtable;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/
class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}