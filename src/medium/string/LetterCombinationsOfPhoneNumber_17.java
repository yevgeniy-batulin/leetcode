package medium.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber_17 {
    private static final Map<Character, List<String>> MAPPING = Map.of(
            '2', List.of("a", "b", "c"),
            '3', List.of("d", "e", "f"),
            '4', List.of("g", "h", "i"),
            '5', List.of("j", "k", "l"),
            '6', List.of("m", "n", "o"),
            '7', List.of("p", "q", "r", "s"),
            '8', List.of("t", "u", "v"),
            '9', List.of("w", "x", "y", "z"));

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return Collections.emptyList();
        ArrayList<String> result = new ArrayList<>();
        generate("", digits, 0, result);
        return result;
    }

    private void generate(String current, String digits, int index, List<String> result) {
        if (index == digits.length())
            result.add(current);
        else
            for (String letter : MAPPING.get(digits.charAt(index)))
                generate(current + letter, digits, index + 1, result);
    }

    public static void main(String[] args) {
        System.out.println(new LetterCombinationsOfPhoneNumber_17().letterCombinations("234"));
    }
}
