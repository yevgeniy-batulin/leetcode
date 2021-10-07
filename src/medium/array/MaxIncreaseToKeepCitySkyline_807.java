package medium.array;

public class MaxIncreaseToKeepCitySkyline_807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxRowArray = new int[grid.length];
        int[] maxColumnArray = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            int maxRow = Integer.MIN_VALUE;
            int maxColumn = Integer.MIN_VALUE;
            for (int j = 0; j < grid.length; j++) {
                maxRow = Math.max(maxRow, grid[i][j]);
                maxColumn = Math.max(maxColumn, grid[j][i]);
            }
            maxRowArray[i] = maxRow;
            maxColumnArray[i] = maxColumn;
        }

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                result += Math.min(maxRowArray[i], maxColumnArray[j]) - grid[i][j];
            }
        }
        return result;
    }
}
