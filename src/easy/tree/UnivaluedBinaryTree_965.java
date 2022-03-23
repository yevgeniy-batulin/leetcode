package easy.tree;

public class UnivaluedBinaryTree_965 {
	public boolean isUnivalTree(TreeNode root) {
		return isUnivalued(root, root.val);
	}

	private boolean isUnivalued(TreeNode node, int value) {
		if (node == null) {
			return true;
		}

		if (node.val != value) {
			return false;
		}

		return isUnivalued(node.left, value) && isUnivalued(node.right, value);
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
