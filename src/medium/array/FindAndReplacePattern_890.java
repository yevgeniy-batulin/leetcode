package medium.array;

import java.util.ArrayList;
import java.util.List;

public class FindAndReplacePattern_890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        outer:
        for (String word : words) {
            int[] patternToWordMapping = new int[27];
            int[] wordToPatternMapping = new int[27];
            for (int i = 0; i < word.length(); i++) {
                int patternLetter = pattern.charAt(i) - 'a' + 1;
                int wordLetter = word.charAt(i) - 'a' + 1;
                if ((patternToWordMapping[patternLetter] != 0 && patternToWordMapping[patternLetter] != wordLetter)
                        || (wordToPatternMapping[wordLetter] != 0 && wordToPatternMapping[wordLetter] != patternLetter)) {
                    continue outer;
                }
                patternToWordMapping[patternLetter] = wordLetter;
                wordToPatternMapping[wordLetter] = patternLetter;
            }
            result.add(word);
        }
        return result;
    }
}
