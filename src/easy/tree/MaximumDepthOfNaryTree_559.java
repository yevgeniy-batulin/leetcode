package easy.tree;

import java.util.List;

public class MaximumDepthOfNaryTree_559 {
	public int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		return getDepth(root, 1);
	}

	private int getDepth(Node node, int depth) {
		if (node == null || node.children.isEmpty()) {
			return depth;
		}

		int maxDepth = 0;
		for (Node child : node.children) {
			maxDepth = Math.max(maxDepth, getDepth(child, depth + 1));
		}
		return maxDepth;
	}

	static class Node {
		public int val;
		public List<Node> children;
	}
}
