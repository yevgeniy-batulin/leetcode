package medium.tree;

public class ConvertBstToGreaterTree_538 {
	public TreeNode convertBST(TreeNode root) {
		helper(root, 0);
		return root;
	}

	private int helper(TreeNode node, int greater) {
		if (node == null) {
			return greater;
		}

		int right = helper(node.right, greater);
		node.val += right;
		int left = helper(node.left, node.val);
		return left;
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
