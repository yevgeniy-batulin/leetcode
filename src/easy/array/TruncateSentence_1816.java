package easy.array;

public class TruncateSentence_1816 {
    public String truncateSentence(String s, int k) {
        int countOfSpaces = 0;
        int i = 0;
        while (i < s.length() && countOfSpaces < k) {
            if (s.charAt(i) == ' ') {
                countOfSpaces++;
            }
            i++;
        }

        return countOfSpaces == k ? s.substring(0 , i - 1) : s;
    }
}
