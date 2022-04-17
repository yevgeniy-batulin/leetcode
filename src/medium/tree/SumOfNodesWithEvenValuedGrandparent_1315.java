package medium.tree;

class SumOfNodesWithEvenValuedGrandparent_1315 {
	public int sumEvenGrandparent(TreeNode root) {
		return evenGrandparentCount(root, false, false);
	}

	private int evenGrandparentCount(TreeNode node, boolean evenParent, boolean evenGrandparent) {
		if (node == null) {
			return 0;
		}

		boolean evenCurrent = node.val % 2 == 0;

		return (evenGrandparent ? node.val : 0)
				+ evenGrandparentCount(node.left, evenCurrent, evenParent)
				+ evenGrandparentCount(node.right, evenCurrent, evenParent);
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
