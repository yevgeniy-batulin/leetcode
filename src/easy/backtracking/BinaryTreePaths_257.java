package easy.backtracking;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths_257 {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> paths = new ArrayList<>();
		helper(root, "", paths);
		return paths;
	}

	private void helper(TreeNode node, String path, List<String> paths) {
		if (node.left == null && node.right == null) {
			paths.add(path + node.val);
			return;
		}

		if (node.left != null) {
			helper(node.left, path + node.val + "->", paths);
		}
		if (node.right != null) {
			helper(node.right, path + node.val + "->", paths);
		}
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}
	}
}
