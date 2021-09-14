package easy.array;

class FindUniqueIntegersSumUpToZero_1304 {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 0; i < result.length; i += 2) {
            result[i] = n;
            result[i + 1] = -n;
            n--;
        }
        return result;
    }
}