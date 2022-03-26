package medium.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal_429 {
	public List<List<Integer>> levelOrder(Node root) {
		if (root == null) {
			return Collections.emptyList();
		}
		List<List<Integer>> result = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			List<Integer> level = new ArrayList<>();
			int size = q.size();
			while (size > 0) {
				Node node = q.poll();
				level.add(node.val);
				q.addAll(node.children);
				size--;
			}
			result.add(level);
		}
		return result;
	}

	static class Node {
		public int val;
		public List<Node> children;
	}
}
