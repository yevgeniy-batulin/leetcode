package easy.array;

class FindLuckyIntegerInArray_1394 {
    public int findLucky(int[] nums) {
        int[] count = new int[501];

        for (int num : nums)
            count[num]++;

        for (int i = count.length - 1; i > 0; i--)
            if (count[i] == i)
                return i;
        return -1;
    }
}