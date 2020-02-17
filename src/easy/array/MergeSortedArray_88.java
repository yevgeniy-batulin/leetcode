package easy.array;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/
class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while(j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0,};
        new MergeSortedArray_88().merge(nums1, 3, new int[]{1, 2, 3}, 3);
        System.out.println(Arrays.toString(nums1));
    }
}