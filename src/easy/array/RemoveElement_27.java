package easy.array;

//https://leetcode.com/problems/remove-element/
class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val)
                nums[i] = nums[j--];
            else
                i++;
        }

        return i;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveElement_27().removeElement(new int[]{2}, 3));
    }
}