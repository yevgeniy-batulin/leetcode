package medium.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo_1282 {
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < groupSizes.length; i++) {
			map.putIfAbsent(groupSizes[i], new ArrayList<>());
			map.get(groupSizes[i]).add(i);
		}

		List<List<Integer>> groups = new ArrayList<>();
		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
			if (entry.getValue().size() == entry.getKey()) {
				groups.add(entry.getValue());
			} else {
				for (int i = 0; i < entry.getValue().size(); i += entry.getKey()) {
					groups.add(entry.getValue().subList(i, i + entry.getKey()));
				}
			}
		}
		return groups;
	}

	public List<List<Integer>> groupThePeopleShorter(int[] groupSizes) {
		List<List<Integer>> groups = new ArrayList<>();
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < groupSizes.length; i++) {
			map.putIfAbsent(groupSizes[i], new ArrayList<>());
			List<Integer> group = map.get(groupSizes[i]);
			group.add(i);
			if (group.size() == groupSizes[i]) {
				groups.add(group);
				map.put(groupSizes[i], new ArrayList<>());
			}
		}
		return groups;
	}
}
