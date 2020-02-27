package medium.tree;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/find-bottom-left-tree-value/
class FindBottomLeftTreeValue_513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode last = root;
        while (!q.isEmpty()) {
            last = q.poll();
            if (last.right != null) q.offer(last.right);
            if (last.left != null) q.offer(last.left);
        }
        return last.val;
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