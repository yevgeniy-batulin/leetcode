package medium.tree;

public class CheckIfStringValidSequenceFromRootToLeavesPathInBinaryTree_1430 {
	public boolean isValidSequence(TreeNode root, int[] arr) {
		return helper(root, arr, 0);
	}

	private boolean helper(TreeNode node, int[] array, int index) {
		if (node == null || index >= array.length || node.val != array[index]) {
			return false;
		}
		if (index == array.length - 1 && node.val == array[index] && node.left == null && node.right == null) {
			return true;
		}

		return helper(node.left, array, index + 1) || helper(node.right, array, index + 1);
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
