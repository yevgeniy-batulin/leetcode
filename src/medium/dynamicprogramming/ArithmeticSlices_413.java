package medium.dynamicprogramming;

class ArithmeticSlices_413 {
    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3) return 0;

        int diff = A[1] - A[0];
        int count = 0;
        int result = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == diff) {
                count++;
                result += count;
            } else {
                diff = A[i] - A[i - 1];
                count = 0;
            }
        }
        return result;
    }
}