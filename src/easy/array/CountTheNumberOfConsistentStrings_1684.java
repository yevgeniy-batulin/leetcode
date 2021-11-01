package easy.array;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistentStrings_1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> chars = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            chars.add(c);
        }

        int count = 0;
        outer:
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (!chars.contains(c)) {
                    continue outer;
                }
            }
            count++;
        }
        return count;
    }
}
