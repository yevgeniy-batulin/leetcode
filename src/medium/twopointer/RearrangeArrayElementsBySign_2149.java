package medium.twopointer;

public class RearrangeArrayElementsBySign_2149 {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int positivesIndex = 0;
        int negativesIndex = 1;

        for(int num : nums) {
            if(num > 0) {
                result[positivesIndex] = num;
                positivesIndex += 2;
            } else {
                result[negativesIndex] = num;
                negativesIndex += 2;
            }
        }

        return result;
    }
}
