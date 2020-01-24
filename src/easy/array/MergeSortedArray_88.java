package easy.array;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/
class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int resultIndex = 0;
        int i = 0;
        int j = 0;

        while (j < m && i < n) {
            if (nums2[i] < nums1[resultIndex]) {
                System.arraycopy(nums1, resultIndex, nums1, resultIndex + 1, m - j);
                nums1[resultIndex] = nums2[i];
                resultIndex++;
                i++;
            } else {
                resultIndex++;
                j++;
            }
        }

        while (i < n) nums1[resultIndex++] = nums2[i++];
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0,};
        new MergeSortedArray_88().merge(nums1, 3, new int[]{1, 2, 3}, 3);
        System.out.println(Arrays.toString(nums1));
    }
}