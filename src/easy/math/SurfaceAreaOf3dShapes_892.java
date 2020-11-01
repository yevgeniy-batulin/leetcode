package easy.math;

class SurfaceAreaOf3dShapes_892 {
    public int surfaceArea(int[][] grid) {
        int area = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0)
                    continue;

                if (i + 1 < n) {
                    if (grid[i][j] > grid[i + 1][j]) {
                        area += grid[i][j] - grid[i + 1][j];
                    }
                } else {
                    area += grid[i][j];
                }

                if (i - 1 >= 0) {
                    if (grid[i][j] > grid[i - 1][j]) {
                        area += grid[i][j] - grid[i - 1][j];
                    }
                } else {
                    area += grid[i][j];
                }

                if (j + 1 < n) {
                    if (grid[i][j] > grid[i][j + 1]) {
                        area += grid[i][j] - grid[i][j + 1];
                    }
                } else {
                    area += grid[i][j];
                }

                if (j - 1 >= 0) {
                    if (grid[i][j] > grid[i][j - 1]) {
                        area += grid[i][j] - grid[i][j - 1];
                    }
                } else {
                    area += grid[i][j];
                }
            }
        }
        return area;
    }
}