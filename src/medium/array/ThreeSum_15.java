package medium.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return Collections.emptyList();

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (index > 0 && nums[index] == nums[index - 1]) {
                continue; // skip duplicates
            }
            int i = index + 1;
            int j = nums.length - 1;
            while (i < j) {
                int sum = nums[i] + nums[j];
                if (sum == -nums[index]) {
                    result.add(List.of(nums[i], nums[j], nums[index]));
                    while (i < j && nums[i] == nums[i+1]) {
                        i++; // skip duplicates
                    }
                    while (i < j && nums[j] == nums[j-1]) {
                        j--; // skip duplicates
                    }
                    i++;
                    j--;
                } else if (sum < -nums[index]) i++;
                else j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ThreeSum_15().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}