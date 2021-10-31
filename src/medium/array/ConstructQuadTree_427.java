package medium.array;

public class ConstructQuadTree_427 {
    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }

    public Node construct(int[][] grid) {
        return recurrence(grid, 0, 0, grid.length);
    }

    private Node recurrence(int[][] grid, int r, int c, int n) {
        if (isSameValue(grid, r, c, n)) {
            return new Node(grid[r][c] == 1, true);
        }
        Node node = new Node(false, false);
        node.topLeft = recurrence(grid, r, c, n / 2);
        node.topRight = recurrence(grid, r, c + n / 2, n / 2);
        node.bottomLeft = recurrence(grid, r + n / 2, c, n / 2);
        node.bottomRight = recurrence(grid, r + n / 2, c + n / 2, n / 2);
        return node;
    }

    private boolean isSameValue(int[][] grid, int r, int c, int n) {
        int value = grid[r][c];
        for (int i = r; i < r + n; i++) {
            for (int j = c; j < c + n; j++) {
                if (grid[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }

}
