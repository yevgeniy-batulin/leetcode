package medium.tree;

import java.util.LinkedList;
import java.util.Queue;

class PopulatingNextRightPointersInEachNode_116 {
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int levelSize = 1;
        int levelCount = 1;
        while (!q.isEmpty()) {
            Node poll = q.poll();
            if (levelCount < levelSize) {
                poll.next = q.peek();
                levelCount++;
            } else {
                levelSize *= 2;
                levelCount = 1;
            }

            if (poll.left != null)
                q.offer(poll.left);
            if (poll.right != null)
                q.offer(poll.right);
        }
        return root;
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}