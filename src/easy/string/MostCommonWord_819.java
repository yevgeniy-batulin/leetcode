package easy.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class MostCommonWord_819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> countMap = new HashMap<>();
        StringBuilder word = new StringBuilder();
        String trimmedParagraph = paragraph.trim();
        for (int i = 0; i < trimmedParagraph.length(); i++) {
            char c = trimmedParagraph.charAt(i);
            if (Character.isLetter(c)) word.append(Character.toLowerCase(c));
            else addAllowedWord(bannedSet, countMap, word.toString());
        }
        addAllowedWord(bannedSet, countMap, word.toString());

        int max = Integer.MIN_VALUE;
        String result = null;
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

    private void addAllowedWord(Set<String> bannedSet, Map<String, Integer> countMap, String word) {
        if (word.length() != 0) {
            if (!bannedSet.contains(word)) {
                int count = countMap.getOrDefault(word, 0);
                countMap.put(word, count + 1);
            }
        }
    }
}