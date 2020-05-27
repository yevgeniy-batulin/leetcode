package easy.string;

public class RemoveVowelsFromString_1119 {
    public String removeVowels(String S) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (!isVowel(c)) result.append(c);
        }
        return result.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
