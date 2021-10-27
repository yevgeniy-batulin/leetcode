package easy.array;

public class SumOfUniqueElements_1748 {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }
        int result = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1)
                result += i;
        }
        return result;
    }
}
