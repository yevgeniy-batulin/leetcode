package easy.hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate_217 {
    public boolean containsDuplicateLinear(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int num: nums) {
            if(numbers.contains(num)) {
                return true;
            }
            numbers.add(num);
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1) {
            return false;
        }

        Arrays.sort(nums);
        for(int index = 1; index < nums.length; index++) {
            if(nums[index] == nums[index - 1]) {
                return true;
            }
        }
        return false;
    }
}
