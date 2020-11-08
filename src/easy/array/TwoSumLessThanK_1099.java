package easy.array;

import java.util.Arrays;

class TwoSumLessThanK_1099 {
    public int twoSumLessThanK(int[] array, int k) {
        if (array.length == 1) return -1;

        Arrays.sort(array);
        int maxSum = -1;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num >= k) break;

            int toFind = k - num - 1;
            int found = binarySearch(array, toFind);
            if (found < 0)
                found = -found - 1;

            if (found == array.length || array[found] > toFind)
                found--;
            if (found > i)
                maxSum = Math.max(maxSum, array[found] + num);
        }
        return maxSum;
    }

    private int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = ((right - left) / 2) + left;
            if (array[middle] == key)
                return middle;
            if (key > array[middle])
                left = middle + 1;
            else
                right = middle - 1;
        }
        return -(left + 1);
    }
}