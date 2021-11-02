package medium.array;

public class QueriesOnNumberOfPointsInsideCircle_1828 {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int[] point : points) {
                int x = queries[i][0] - point[0];
                int y = queries[i][1] - point[1];
                int dist = x * x + y * y;
                if (dist <= queries[i][2] * queries[i][2]) {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
