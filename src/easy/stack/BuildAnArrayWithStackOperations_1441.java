package easy.stack;

import java.util.ArrayList;
import java.util.List;

class BuildAnArrayWithStackOperations_1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0, j = 1; i < target.length && j <= n; i++, j++) {
            while (j < target[i]) {
                j++;
                result.add("Push");
                result.add("Pop");
            }
            result.add("Push");
        }
        return result;
    }
}