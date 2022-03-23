package easy.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindAllTheLonelyNodes_1469 {
	public List<Integer> getLonelyNodes(TreeNode root) {
		List<Integer> lonelyNodes = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode node = q.poll();
			if (node.left != null) {
				q.offer(node.left);
				if (node.right == null) {
					lonelyNodes.add(node.left.val);
				}
			}

			if (node.right != null) {
				q.offer(node.right);
				if (node.left == null) {
					lonelyNodes.add(node.right.val);
				}
			}
		}
		return lonelyNodes;
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
