
package easy.array;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class ThirdMaximumNumber_414 {
    // 0 ms
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                thirdMax = secondMax;
                secondMax = thirdMax;
            } else if (num > thirdMax) {
                thirdMax = num;
            }
        }

        return thirdMax == Long.MIN_VALUE ? (int) firstMax : (int) thirdMax;
    }

    // 4 ms
    public int thirdMaxAlternative(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
            if (set.size() > 3)
                set.remove(Collections.min(set));
        }

        if (set.size() == 3)
            return Collections.min(set);
        else
            return Collections.max(set);
    }
}