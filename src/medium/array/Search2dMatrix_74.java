package medium.array;

public class Search2dMatrix_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int start = 0;
        int end = matrix.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length - 1]) {
                int startInternal = 0;
                int endInternal = matrix[mid].length;
                while (startInternal < endInternal) {
                    int midInternal = startInternal + (endInternal - startInternal) / 2;
                    if (target == matrix[mid][midInternal])
                        return true;
                    if (target > matrix[mid][midInternal])
                        startInternal = midInternal + 1;
                    if (target < matrix[mid][midInternal])
                        endInternal = midInternal;
                }
                return false;
            }
            if (target < matrix[mid][0])
                end = mid;
            if (target > matrix[mid][matrix[mid].length - 1])
                start = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Search2dMatrix_74().searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 13));
    }
}
