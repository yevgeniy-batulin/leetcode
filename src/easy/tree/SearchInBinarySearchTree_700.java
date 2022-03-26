package easy.tree;

public class SearchInBinarySearchTree_700 {
	public TreeNode searchBST(TreeNode root, int val) {
		while (root != null && root.val != val) {
			if (val < root.val) {
				root = root.left;
			} else {
				root = root.right;
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
