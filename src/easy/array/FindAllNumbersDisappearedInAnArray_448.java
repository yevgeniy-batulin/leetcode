package easy.array;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class FindAllNumbersDisappearedInAnArray_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] count = new int[nums.length + 1];
        for (int num : nums)
            count[num]++;
        for (int i = 1; i < count.length; i++)
            if (count[i] == 0)
                result.add(i);
        return result;
    }
}