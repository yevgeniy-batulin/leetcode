package easy.array;

import java.util.Arrays;

class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new PlusOne_66().plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(new PlusOne_66().plusOne(new int[]{0})));
        System.out.println(Arrays.toString(new PlusOne_66().plusOne(new int[]{9, 9})));
    }
}