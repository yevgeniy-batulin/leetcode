package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget_797 {
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<List<Integer>> paths = new ArrayList<>();
		dfs(graph, 0, new ArrayList<>(), paths);
		return paths;
	}

	private void dfs(int[][] graph, int nodeIndex, List<Integer> path, List<List<Integer>> paths) {
		path.add(nodeIndex);
		if (nodeIndex == graph.length - 1) {
			paths.add(path);
			return;
		}

		for (int childIndex : graph[nodeIndex]) {
			dfs(graph, childIndex, new ArrayList<>(path), paths);
		}
	}
}
