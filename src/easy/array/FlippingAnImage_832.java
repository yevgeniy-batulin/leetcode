package easy.array;

class FlippingAnImage_832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < (m + 1) / 2; c++) {
                int temp = A[r][c] ^ 1;
                A[r][c] = A[r][m - c - 1] ^ 1;
                A[r][m - c - 1] = temp;
            }
        }

        return A;
    }
}