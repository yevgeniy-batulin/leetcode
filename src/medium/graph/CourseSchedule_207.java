package medium.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule_207 {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		int[] inDegree = new int[numCourses];
		List<List<Integer>> adjacents = new ArrayList<>();
		for (int index = 0; index < numCourses; index++) {
			adjacents.add(new ArrayList<>());
		}
		for (int index = 0; index < prerequisites.length; index++) {
			inDegree[prerequisites[index][0]]++;
			adjacents.get(prerequisites[index][1]).add(prerequisites[index][0]);
		}

		Queue<Integer> q = new LinkedList<>();
		for (int index = 0; index < inDegree.length; index++) {
			if (inDegree[index] == 0) {
				q.offer(index);
			}
		}

		int count = 0;

		while (!q.isEmpty()) {
			int vertice = q.poll();
			count++;

			for (Integer adjacent : adjacents.get(vertice)) {
				inDegree[adjacent]--;
				if (inDegree[adjacent] == 0) {
					q.offer(adjacent);
				}
			}
		}

		return count == numCourses;
	}
}
