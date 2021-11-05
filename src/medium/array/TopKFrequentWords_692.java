package medium.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class TopKFrequentWords_692 {
	public List<String> topKFrequentShorter(String[] words, int k) {
		Map<String, Integer> count = new HashMap<>();
		for (String word : words) {
			count.put(word, count.getOrDefault(word, 0) + 1);
		}

		List<String> topFrequentWords = new ArrayList<>(count.keySet());
		topFrequentWords.sort((a, b) -> count.get(a).equals(count.get(b)) ? a.compareTo(b) : count.get(a) - count.get(b));
		return topFrequentWords.subList(0, k);
	}

	public List<String> topKFrequent(String[] words, int k) {
		Map<String, Integer> count = new HashMap<>();
		for (String word : words) {
			count.put(word, count.getOrDefault(word, 0) + 1);
		}

		Map<Integer, List<String>> sortedWords = new TreeMap<>(Collections.reverseOrder());
		for (Map.Entry<String, Integer> entry : count.entrySet()) {
			sortedWords.putIfAbsent(entry.getValue(), new ArrayList<>());
			sortedWords.get(entry.getValue()).add(entry.getKey());
		}

		List<String> topFrequentWords = new ArrayList<>();
		for (List<String> strings : sortedWords.values()) {
			Collections.sort(strings);
			if (strings.size() <= k) {
				topFrequentWords.addAll(strings);
				k -= strings.size();
			} else {
				topFrequentWords.addAll(strings.subList(0, k));
				break;
			}
		}
		return topFrequentWords;
	}
}
