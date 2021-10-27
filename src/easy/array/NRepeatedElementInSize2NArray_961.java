package easy.array;

public class NRepeatedElementInSize2NArray_961 {
    public int repeatedNTimes(int[] nums) {
        boolean[] seen = new boolean[10001];
        for (int num : nums) {
            if (seen[num]) {
                return num;
            }
            seen[num] = true;
        }
        return 0;
    }
}
