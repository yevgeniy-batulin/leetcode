package medium.heap;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointsToOrigin_973 {
	public int[][] kClosest(int[][] points, int k) {
		Queue<List<Integer>> maxHeap = new PriorityQueue<>((firstPoint, secondPoint) ->
				distanceFromOrigin(secondPoint) - distanceFromOrigin(firstPoint));

		for (int[] point : points) {
			maxHeap.offer(List.of(point[0], point[1]));

			if (maxHeap.size() > k) {
				maxHeap.poll();
			}
		}

		int[][] closestPoints = new int[k][2];
		while (!maxHeap.isEmpty()) {
			List<Integer> point = maxHeap.poll();
			k--;
			closestPoints[k][0] = point.get(0);
			closestPoints[k][1] = point.get(1);
		}

		return closestPoints;
	}

	private int distanceFromOrigin(List<Integer> coordinates) {
		return coordinates.get(0) * coordinates.get(0) + coordinates.get(1) * coordinates.get(1);
	}
}
