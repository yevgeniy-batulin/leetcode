package easy.string;

import java.util.HashMap;
import java.util.Map;

public class NumberOfStringsThatAppearAsSubstringsInWord_1967 {
	public int numOfStringsSimple(String[] patterns, String word) {
		int count = 0;
		for (String pattern : patterns) {
			if (word.contains(pattern)) {
				count++;
			}
		}
		return count;
	}

	static class SolutionUsingSuffixTrie {
		public int numOfStrings(String[] patterns, String word) {
			Node root = buildSuffixTrie(word);
			int count = 0;
			for (String pattern : patterns) {
				if (matches(pattern, root)) {
					count++;
				}
			}
			return count;
		}

		private Node buildSuffixTrie(String word) {
			Node root = new Node();
			for (int index = word.length() - 1; index >= 0; index--) {
				fillTrie(word.substring(index), root);
			}
			return root;
		}

		private void fillTrie(String word, Node root) {
			Node currentNode = root;
			for (char character : word.toCharArray()) {
				if (currentNode.getVertice(character) == null) {
					currentNode.addVertice(character);
				}
				currentNode = currentNode.getVertice(character);
			}
		}

		private boolean matches(String pattern, Node root) {
			Node currentNode = root;
			for (char character : pattern.toCharArray()) {
				if (currentNode.getVertice(character) != null) {
					currentNode = currentNode.getVertice(character);
				} else {
					return false;
				}
			}
			return true;
		}

		private static class Node {
			private final Map<Character, Node> vertices;

			private Node() {
				this.vertices = new HashMap<>();
			}

			public Node getVertice(char character) {
				return vertices.get(character);
			}

			public void addVertice(char character) {
				vertices.put(character, new Node());
			}
		}
	}
}
