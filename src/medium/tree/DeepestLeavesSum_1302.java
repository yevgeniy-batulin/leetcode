package medium.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum_1302 {
	public int deepestLeavesSum(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		int sum = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			int levelSum = 0;
			while (size > 0) {
				size--;
				TreeNode node = q.poll();
				levelSum += node.val;
				if (node.left != null) {
					q.offer(node.left);
				}
				if (node.right != null) {
					q.offer(node.right);
				}
			}
			sum = levelSum;
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
