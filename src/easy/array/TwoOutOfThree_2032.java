package easy.array;

import java.util.ArrayList;
import java.util.List;

public class TwoOutOfThree_2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> commonNumbers = new ArrayList<>();
        boolean[] seen1 = new boolean[101];
        boolean[] seen2 = new boolean[101];
        boolean[] seen3 = new boolean[101];
        fillCount(seen1, nums1);
        fillCount(seen2, nums2);
        fillCount(seen3, nums3);
        for (int i = 0; i < seen1.length; i++) {
            if ((seen1[i] && seen2[i]) || (seen1[i] && seen3[i]) || (seen2[i] && seen3[i])) {
                commonNumbers.add(i);
            }
        }
        return commonNumbers;
    }

    private void fillCount(boolean[] seen, int[] nums) {
        for (int num : nums) {
            seen[num] = true;
        }
    }
}
