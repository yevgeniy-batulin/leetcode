package easy.array;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquaresOfASortedArray_977 {
    public int[] sortedSquares(int[] A) {
        int negative = 0;
        while (negative < A.length && A[negative] < 0) {
            negative++;
        }
        int positive = negative--;

        int i = 0;
        int[] result = new int[A.length];
        while (negative >= 0 && positive < A.length) {
            int value;

            if (A[positive] < Math.abs(A[negative])) value = A[positive++];
            else value = A[negative--];

            result[i++] = value * value;
        }

        while (negative >= 0) result[i++] = A[negative] * A[negative--];
        while (positive < A.length) result[i++] = A[positive] * A[positive++];

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SquaresOfASortedArray_977().sortedSquares(new int[]{-4, -1, 0, 3, 10})));
//        System.out.println(Arrays.toString(new SquaresOfASortedArray_977().sortedSquares(new int[]{-1})));
//        System.out.println(Arrays.toString(new SquaresOfASortedArray_977().sortedSquares(new int[]{0, 2})));
    }
}