package easy.array;

import java.util.Arrays;

public class DecompressRunLengthEncodedList_1313 {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2)
            size += nums[i];
        int[] result = new int[size];
        for (int i = 0, j = 0, k = 1; i < result.length; j += 2, k += 2) {
            while (nums[j]-- > 0)
                result[i++] = nums[k];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new DecompressRunLengthEncodedList_1313().decompressRLElist(new int[]{1, 1, 2, 3})));
    }
}
