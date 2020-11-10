package easy.string;

import java.util.HashSet;
import java.util.Set;

class UniqueMorseCodeWords_804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] mapping = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--."
                , "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...",
                "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder morse = new StringBuilder();
            for (char c : word.toCharArray())
                morse.append(mapping[c - 'a']);
            set.add(morse.toString());
        }

        return set.size();
    }
}