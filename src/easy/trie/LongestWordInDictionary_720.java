package easy.trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class LongestWordInDictionary_720 {
    public String longestWord(String[] words) {
        Node root = buildTrie(words);
        return findLongest(root, words);
    }

    private Node buildTrie(String[] words) {
        Node root = new Node('^');

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            Node node = root;
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                node.children.putIfAbsent(c, new Node(c));
                node = node.children.get(c);

                if (j == word.length() - 1)
                    node.index = i;
            }
        }
        return root;
    }

    private String findLongest(Node root, String[] words) {
        String longest = "";
        Stack<Node> stack = new Stack<>();
        for (Node value : root.children.values()) {
            stack.push(value);
        }

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node.index >= 0) {
                if (longest.length() < words[node.index].length()
                        || longest.length() == words[node.index].length() && longest.compareTo(words[node.index]) > 0) {
                    longest = words[node.index];
                }

                for (Node value : node.children.values()) {
                    stack.push(value);
                }
            }
        }

        return longest;
    }

    private static class Node {
        char c;
        Map<Character, Node> children;
        int index;

        Node(char c) {
            this.c = c;
            this.children = new HashMap<>();
            this.index = -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LongestWordInDictionary_720().longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"}));
    }
}