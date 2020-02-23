package easy.tree;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree
class ConvertSortedArrayToBinarySearchTree_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return internal(nums, 0, nums.length);
    }

    public TreeNode internal(int[] nums, int i, int j) {
        if (i >= j) return null;

        int middle = (i + j) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = internal(nums, i, middle);
        node.right = internal(nums, middle + 1, j);
        return node;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}