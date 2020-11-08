package medium.dynamicprogramming;

class CountSquareSubmatricesWithAllOnes_1277 {
    public int countSquares(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > 0 && i > 0 && j > 0) {
                    matrix[i][j] = 1 + Math.min(Math.min(matrix[i - 1][j], matrix[i][j - 1]), matrix[i - 1][j - 1]);
                }
                count += matrix[i][j];
            }
        }
        return count;
    }

    public int countSquaresRecursiveWithMemoization(int[][] matrix) {
        int[][] memoization = new int[matrix.length][matrix[0].length];
        int count = 0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                count += dfs(matrix, i, j, memoization);
        return count;
    }

    private int dfs(int[][] matrix, int i, int j, int[][] memoization) {
        if (i >= matrix.length || i < 0 || j >= matrix[0].length || j < 0 || matrix[i][j] == 0)
            return 0;
        if (memoization[i][j] > 0)
            return memoization[i][j];

        memoization[i][j] = 1 + Math.min(Math.min(dfs(matrix, i + 1, j, memoization),
                dfs(matrix, i, j + 1, memoization)), dfs(matrix, i + 1, j + 1, memoization));
        return memoization[i][j];
    }

    public static void main(String[] args) {
        System.out.println(new CountSquareSubmatricesWithAllOnes_1277().countSquares(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}}));
    }
}