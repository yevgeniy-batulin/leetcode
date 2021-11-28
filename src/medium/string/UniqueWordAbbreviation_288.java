package medium.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWordAbbreviation_288 {
	static class ValidWordAbbrAlternative {
		private final Map<String, String> mapping;

		public ValidWordAbbrAlternative(String[] dictionary) {
			mapping = new HashMap<>();
			for (String word : dictionary) {
				String abbreviation = getAbbreviation(word);
				if (mapping.containsKey(abbreviation) && !mapping.get(abbreviation).equals(word)) {
					mapping.put(abbreviation, "");
				} else {
					mapping.put(abbreviation, word);
				}
			}
		}

		public boolean isUnique(String word) {
			String abbreviation = getAbbreviation(word);
			if (mapping.containsKey(abbreviation)) {
				return mapping.get(abbreviation).equals(word);
			} else {
				return true;
			}
		}

		private String getAbbreviation(String string) {
			if (string.length() <= 2) return string;

			return string.charAt(0) +
					String.valueOf(string.length() - 2) +
					string.charAt(string.length() - 1);
		}
	}

	static class ValidWordAbbr {
		private final Map<String, Set<String>> mapping;

		public ValidWordAbbr(String[] dictionary) {
			mapping = new HashMap<>();
			for (String word : dictionary) {
				String abbreviation = getAbbreviation(word);
				mapping.putIfAbsent(abbreviation, new HashSet<>());
				mapping.get(abbreviation).add(word);
			}
		}

		public boolean isUnique(String word) {
			String abbreviation = getAbbreviation(word);
			if (mapping.containsKey(abbreviation)) {
				return mapping.get(abbreviation).contains(word) && mapping.get(abbreviation).size() == 1;
			} else {
				return true;
			}
		}

		private String getAbbreviation(String string) {
			if (string.length() <= 2) return string;

			return string.charAt(0) +
					String.valueOf(string.length() - 2) +
					string.charAt(string.length() - 1);
		}
	}
}
