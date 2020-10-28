package easy.tree;

import java.util.Stack;

class SumOfLeftLeaves_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        int sum = 0;
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();

            if (pop.right != null) stack.push(pop.right);

            if (pop.left != null) {
                if (pop.left.left == null && pop.left.right == null)
                    sum += pop.left.val;
                else
                    stack.push(pop.left);
            }

        }
        return sum;
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