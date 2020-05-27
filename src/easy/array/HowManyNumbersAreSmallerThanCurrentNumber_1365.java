package easy.array;

public class HowManyNumbersAreSmallerThanCurrentNumber_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] position = new int[101];
        for (int num : nums)
            position[num]++;
        for (int i = 1; i < position.length; i++)
            position[i] += position[i - 1];
        for (int i = 0; i < nums.length; i++)
            nums[i] = nums[i] == 0 ? 0 : position[nums[i] - 1];
        return nums;
    }
}
