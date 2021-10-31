package easy.array;

public class FindNearestPointThatHasTheSameXOrYCoordinate_1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDistanceIndex = -1;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (x == points[i][0] || y == points[i][1]) {
                int distance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (distance < minDistance) {
                    minDistance = distance;
                    minDistanceIndex = i;
                }
            }
        }
        return minDistanceIndex;
    }
}
