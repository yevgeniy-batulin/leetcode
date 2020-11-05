package easy.array;

import java.util.ArrayList;
import java.util.List;

class MissingRanges_163 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        if (nums == null || nums.length == 0) return List.of(formatRange(lower, upper));

        List<String> ranges = new ArrayList<>();
        if (lower < nums[0])
            ranges.add(formatRange(lower, nums[0] - 1));

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1) {
                ranges.add(formatRange(nums[i - 1] + 1, nums[i] - 1));
            }
        }

        if (upper > nums[nums.length - 1])
            ranges.add(formatRange(nums[nums.length - 1] + 1, upper));
        return ranges;
    }

    private String formatRange(int left, int right) {
        if (left == right)
            return String.valueOf(left);
        if (right - left > 0)
            return left + "->" + right;

        return "";
    }
}