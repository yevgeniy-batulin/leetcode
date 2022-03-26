package easy.tree;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class NaryTreePreorderTraversal_589 {
	public List<Integer> preorder(Node root) {
		if (root == null) {
			return Collections.emptyList();
		}

		List<Integer> result = new LinkedList<>();
		Deque<Node> stack = new ArrayDeque<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node node = stack.peek();
			result.add(node.val);
			for (int index = node.children.size() - 1; index >= 0; index--) {
				stack.push(node.children.get(index));
			}
		}
		return result;
	}

	static class Node {
		public int val;
		public List<Node> children;
	}
}
