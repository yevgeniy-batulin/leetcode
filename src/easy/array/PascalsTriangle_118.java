package easy.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/
class PascalsTriangle_118 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(1));
        for (int currentRow = 1; currentRow < numRows; currentRow++) {
            List<Integer> prevRow = result.get(currentRow - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int i = 1; i < currentRow; i++) row.add(prevRow.get(i - 1) + prevRow.get(i));

            row.add(1);
            result.add(row);
        }
        return result;
    }
}