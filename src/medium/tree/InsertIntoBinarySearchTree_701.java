package medium.tree;

public class InsertIntoBinarySearchTree_701 {
	public TreeNode insertIntoBST(TreeNode root, int val) {
		TreeNode current = root;
		while (current != null) {
			if (val < current.val) {
				if (current.left == null) {
					current.left = new TreeNode(val);
					break;
				}
				current = current.left;
			} else {
				if (current.right == null) {
					current.right = new TreeNode(val);
					break;
				}
				current = current.right;
			}
		}

		return new TreeNode(val);
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
