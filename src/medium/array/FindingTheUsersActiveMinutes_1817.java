package medium.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindingTheUsersActiveMinutes_1817 {
	public int[] findingUsersActiveMinutes(int[][] logs, int k) {
		Map<Integer, Set<Integer>> map = new HashMap<>();
		for (int[] log : logs) {
			map.putIfAbsent(log[0], new HashSet<>());
			map.get(log[0]).add(log[1]);
		}

		int[] userActiveMinutes = new int[k];
		for (Set<Integer> minutes: map.values()) {
			userActiveMinutes[minutes.size() - 1]++;
		}
		return userActiveMinutes;
	}
}
