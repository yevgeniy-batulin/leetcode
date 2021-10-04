package easy.array;

public class SearchInsertPosition_35 {
    public int searchInset(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) return middle;
            if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }
        return start;
    }
}
