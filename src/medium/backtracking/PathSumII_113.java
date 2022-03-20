package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PathSumII_113 {
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		List<List<Integer>> paths = new ArrayList<>();
		helper(root, targetSum, new ArrayList<>(), paths);
		return paths;
	}

	private void helper(TreeNode node, int targetSum, List<Integer> path, List<List<Integer>> paths) {
		if (node == null) {
			return;
		}

		targetSum -= node.val;
		path.add(node.val);

		if (targetSum == 0 && node.left == null && node.right == null) {
			paths.add(path);
		} else {
			helper(node.left, targetSum, new ArrayList<>(path), paths);
			helper(node.right, targetSum, new ArrayList<>(path), paths);
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
