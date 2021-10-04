package easy.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;

        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[j] - nums[j - 1] != 1) {
                result.add(getRange(nums[i], nums[j - 1]));
                i = j;
            }
            j++;
        }
        result.add(getRange(nums[i], nums[j - 1]));
        return result;
    }

    private String getRange(int start, int end) {
        if (end - start > 0)
            return start + "->" + end;
        else
            return String.valueOf(start);
    }
}
