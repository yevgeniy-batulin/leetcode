package easy.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class IncreasingOrderSearchTree_897 {
	public TreeNode increasingBST(TreeNode root) {
		Deque<TreeNode> stack = new ArrayDeque<>();
		TreeNode current = root;
		TreeNode newRoot = new TreeNode();
		TreeNode newRootCurrent = newRoot;
		while (!stack.isEmpty() || current != null) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}

			TreeNode pop = stack.pop();
			current = pop.right;

			newRootCurrent.right = pop;
			newRootCurrent = newRootCurrent.right;
			newRootCurrent.left = null;
		}
		return newRoot.right;
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}
	}
}
