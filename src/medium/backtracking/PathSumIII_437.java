package medium.backtracking;

public class PathSumIII_437 {
	int count = 0;

	public int pathSum(TreeNode node, int targetSum) {
		if (node == null) {
			return 0;
		}

		helper(node, targetSum);
		pathSum(node.left, targetSum);
		pathSum(node.right, targetSum);
		return count;
	}

	private void helper(TreeNode node, int targetSum) {
		if (node == null) {
			return;
		}

		if (targetSum - node.val == 0) {
			count++;
		}
		helper(node.left, targetSum - node.val);
		helper(node.right, targetSum - node.val);
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}
	}
}
