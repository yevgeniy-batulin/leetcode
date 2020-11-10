package easy.array;

class MatrixDiagonalSum_1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int r = 0; r < mat.length; r++) {
            sum += mat[r][r];
            sum += mat[r][mat.length - r - 1];
        }
        return sum;
    }
}