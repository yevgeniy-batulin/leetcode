package medium.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileInSystem_609 {
	public List<List<String>> findDuplicate(String[] paths) {
		Map<String, List<String>> contentMap = new HashMap<>();
		for (String path : paths) {
			String[] splittedPath = path.split(" ");
			for (int index = 1; index < splittedPath.length; index++) {
				String[] nameAndContent = splittedPath[index].split("\\(");
				contentMap.putIfAbsent(nameAndContent[1], new ArrayList<>());
				contentMap.get(nameAndContent[1]).add(splittedPath[0] + "/" + nameAndContent[0]);
			}
		}

		List<List<String>> duplicateGroups = new ArrayList<>();
		for (List<String> group : contentMap.values()) {
			if (group.size() > 1) {
				duplicateGroups.add(group);
			}
		}
		return duplicateGroups;
	}
}
