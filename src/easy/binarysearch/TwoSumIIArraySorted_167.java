package easy.binarysearch;

class TwoSumIIArraySorted_167 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int found = binarySearch(numbers, i + 1, target - numbers[i]);
            if (found >= 0)
                return new int[]{i + 1, found + 1};
        }
        return new int[]{};
    }

    private int binarySearch(int[] array, int start, int key) {
        int left = start;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (right - left) / 2 + left;
            if (array[middle] == key)
                return middle;
            else if (array[middle] > key)
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -(left + 1);
    }
}