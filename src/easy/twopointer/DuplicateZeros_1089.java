package easy.twopointer;

public class DuplicateZeros_1089 {
    public void duplicateZeros(int[] array) {
        int zeroCount = 0;
        int length = array.length;
        for (int index = 0; index <= array.length - zeroCount - 1; index++) {
            if (array[index] == 0) {
                if (index == array.length - 1 - zeroCount) {
                    array[array.length - 1] = 0;
                    length--;
                    break;
                }
                zeroCount++;
            }
        }

        int shiftedIndex = length - zeroCount - 1;
        for (int index = length - 1; index >= 0; index--) {
            array[index] = array[shiftedIndex--];
            if (array[index] == 0 && index > 0) {
                array[index - 1] = 0;
                index--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 4, 5, 0, 0, 0, 0, 7};
        new DuplicateZeros_1089().duplicateZeros(array);
        System.out.println(java.util.Arrays.toString(array));
    }
}
