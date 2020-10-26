package easy.tree;

class DiameterOfBinaryTree_543 {
    private int nodesCount = 1;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return nodesCount - 1;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        nodesCount = Math.max(nodesCount, leftHeight + rightHeight + 1);

        return Math.max(leftHeight, rightHeight) + 1;
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