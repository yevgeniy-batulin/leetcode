package medium.backtracking;

// https://leetcode.com/problems/word-search
class WordSearch_79 {
    private int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public boolean exist(char[][] board, String word) {
        for (int row = 0; row < board.length; row++)
            for (int column = 0; column < board[0].length; column++)
                if (check(board, row, column, word, 0))
                    return true;
        return false;
    }

    private boolean check(char[][] board, int row, int column, String word, int position) {
        if (position >= word.length()) return true;

        if (row < 0 || column < 0 || row >= board.length || column >= board[0].length
                || word.charAt(position) != board[row][column])
            return false;

        board[row][column] = '$';
        for (int[] direction : directions) {
            int nextRow = row + direction[0];
            int nextColumn = column + direction[1];
            if (check(board, nextRow, nextColumn, word, position + 1))
                return true;
        }
        board[row][column] = word.charAt(position);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new WordSearch_79().exist(new char[][]{{'a', 'b'}, {'c', 'd'}}, "cdba"));
    }
}