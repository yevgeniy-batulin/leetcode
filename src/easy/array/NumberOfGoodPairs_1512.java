
package easy.array;

class NumberOfGoodPairs_1512 {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int result = 0;
        for(int num : nums) {
        	if(count[num] > 0)
        		result += count[num];
        	count[num]++;
        }
        return result;
    }
}