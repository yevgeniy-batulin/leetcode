package easy.tree;

class BinaryTreeTilt_563 {
    private int tiltSum = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return tiltSum;
    }

    private int dfs(TreeNode root) {
        if (root == null)
            return 0;

        int left = dfs(root.left);
        int right = dfs(root.right);

        tiltSum += Math.abs(right - left);

        return root.val + left + right;
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