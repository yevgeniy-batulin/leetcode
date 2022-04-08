package easy.tree;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/invert-binary-tree/
class InvertBinaryTree_226 {
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}

		TreeNode temp = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(temp);
		return root;
	}

	public TreeNode invertTreeIterative(TreeNode root) {
		if (root == null) {
			return null;
		}

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode node = q.poll();

			TreeNode temp = node.left;
			node.left = node.right;
			node.right = temp;

			if (node.left != null) {
				q.offer(node.left);
			}
			if (node.right != null) {
				q.offer(node.right);
			}
		}

		return root;
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
