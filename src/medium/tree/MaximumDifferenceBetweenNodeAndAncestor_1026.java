package medium.tree;

class MaximumDifferenceBetweenNodeAndAncestor_1026 {
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    private int dfs(TreeNode root, int maxValue, int minValue) {
        if (root == null)
            return maxValue - minValue;

        int max = Math.max(root.val, maxValue);
        int min = Math.min(root.val, minValue);

        int left = dfs(root.left, max, min);
        int right = dfs(root.right, max, min);
        return Math.max(left, right);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}