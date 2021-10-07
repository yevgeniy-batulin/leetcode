package medium.array;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class MaximumBinaryTree_654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return recurrence(nums, 0, nums.length);
    }

    private TreeNode recurrence(int[] nums, int from, int to) {
        if (from == to)
            return null;
        int maxIndex = from;
        for (int i = from + 1; i < to; i++) {
            if (nums[i] > nums[maxIndex])
                maxIndex = i;
        }
        TreeNode node = new TreeNode(nums[maxIndex]);
        node.left = recurrence(nums, from, maxIndex);
        node.right = recurrence(nums, maxIndex + 1, to);
        return node;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
