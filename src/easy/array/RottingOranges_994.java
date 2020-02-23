package easy.array;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/rotting-oranges/
class RottingOranges_994 {
    public int orangesRotting(int[][] grid) {
        Queue<Cell> q = new LinkedList<>();
        boolean noOranges = true;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2)
                    q.offer(new Cell(i, j));
                if (grid[i][j] != 0)
                    noOranges = false;
            }
        if (noOranges) return 0;

        int time = -1;
        int currentRottenCount = q.size();
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!q.isEmpty()) {
            Cell cell = q.poll();
            for (int[] direction : directions) {
                int i = cell.i + direction[0];
                int j = cell.j + direction[1];
                if (i < 0 || j < 0 || i == grid.length || j == grid[0].length)
                    continue;
                if (grid[i][j] == 1) {
                    grid[i][j] = 2;
                    q.offer(new Cell(i, j));
                }
            }
            if (--currentRottenCount == 0) {
                time++;
                currentRottenCount = q.size();
            }
        }

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1)
                    return -1;
        return time;
    }

    static class Cell {
        int i;
        int j;

        Cell(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}