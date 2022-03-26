package easy.tree;

public class SumOfRootToLeafBinaryNumbers_1022 {
	public int sumRootToLeaf(TreeNode root) {
		if (root == null) {
			return 0;
		}

		return getSum(root, 0);
	}

	private int getSum(TreeNode node, int currentSum) {
		currentSum = (currentSum * 2) + node.val;

		if (node.left == null && node.right == null) {
			return currentSum;
		}

		int newSum = 0;
		if (node.left != null) {
			newSum += getSum(node.left, currentSum);
		}
		if (node.right != null) {
			newSum += getSum(node.right, currentSum);
		}
		return newSum;
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
