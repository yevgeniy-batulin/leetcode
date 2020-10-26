package easy.depthfirstsearch;

class FloodFill_733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;

        return internalFloodFill(image, sr, sc, image[sr][sc], newColor);
    }

    private int[][] internalFloodFill(int[][] image, int sr, int sc, int color, int newColor) {
        image[sr][sc] = newColor;

        if (image.length > sr + 1 && image[sr + 1][sc] == color)
            internalFloodFill(image, sr + 1, sc, color, newColor);
        if (sr - 1 >= 0 && image[sr - 1][sc] == color)
            internalFloodFill(image, sr - 1, sc, color, newColor);
        if (image[sr].length > sc + 1 && image[sr][sc + 1] == color)
            internalFloodFill(image, sr, sc + 1, color, newColor);
        if (sc - 1 >= 0 && image[sr][sc - 1] == color)
            internalFloodFill(image, sr, sc - 1, color, newColor);

        return image;
    }
}